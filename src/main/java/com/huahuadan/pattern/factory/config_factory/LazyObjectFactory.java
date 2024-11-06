package com.huahuadan.pattern.factory.config_factory;




import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 工厂类，通过配置文件动态加载产品对象。
 */
public class LazyObjectFactory {
    // 使用线程安全的集合
    private static final ConcurrentHashMap<String, Product> map = new ConcurrentHashMap<>();

    // 懒汉式：使用 volatile 确保对象创建的可见性，且通过 synchronized 保证线程安全
    private static volatile boolean isInitialized = false;

    // 通过静态方法懒加载，初始化的时候才加载配置文件,将加载封装成静态方法只有显示调用时才会加载配置文件创建实例.
    public static synchronized void init() {
        if (isInitialized) {
            return;  // 如果已经初始化过了，则直接返回
        }

        Properties properties = new Properties();
        InputStream inputStream = ObjectFactory.class.getClassLoader().getResourceAsStream("bean.properties");

        if (inputStream == null) {
            throw new RuntimeException("bean.properties 文件未找到！");
        }

        try {
            // 只加载一次
            properties.load(inputStream);
            properties.keySet().forEach(key -> {
                String classname = properties.getProperty((String) key);
                try {
                    // 使用反射加载类并创建对象
                    Product instance = createInstance(classname);
                    map.put((String) key, instance);
                } catch (Exception e) {
                    throw new RuntimeException("创建对象失败: " + classname, e);
                }
            });
            isInitialized = true;  // 标记初始化完成
        } catch (IOException e) {
            throw new RuntimeException("加载配置文件失败", e);
        }
    }

    // 通过反射创建对象并缓存
    private static Product createInstance(String classname) throws Exception {
        Class<?> clazz = Class.forName(classname);  // 获取类对象
        Constructor<?> constructor = clazz.getDeclaredConstructor(); // 获取默认构造器
        return (Product) constructor.newInstance(); // 使用构造器创建实例
    }

    // 获取缓存的对象
    public static Product getProduct(String classname) throws Exception {
        if (!isInitialized) {
            init();  // 确保只有在首次调用时才会初始化
        }
        return map.get(classname);
    }
}

