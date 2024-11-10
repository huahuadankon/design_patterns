package com.huahuadan.pattern.factory.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Properties;

/**
 * 工厂类，通过配置文件动态加载产品对象。这也与SpringIOC容器的原理相匹配.
 * 我们通过配置文件将实体类注册成Bean,用map模拟IOC容器.
 */
public class ObjectFactory {
    //使用线程安全的集合
    private static final ConcurrentHashMap<String, Product> map = new ConcurrentHashMap<>();

    static {
        // 使用静态代码块，确保只会加载一次,也能保证是单例的，不过是饿汉式，在类加载时就创建了所以对象实例，如果类很多会浪费大量内存
        Properties properties = new Properties();
        InputStream inputStream = ObjectFactory.class.getClassLoader().getResourceAsStream("bean.properties");

        if (inputStream == null) {
            throw new RuntimeException("bean.properties 文件未找到！");
        }

        try {
            //只加载一次
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

        return map.get(classname);
    }
}
