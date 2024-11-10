package com.huahuadan.pattern.proxy.jdk_dynamic_proxy;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author liuyichen
 * @version 1.0
 * 创建代理对象的工厂类 ProxyFactory不是代理模式中所说的代理类，而代理类是程序在运行过程中动态的在内存中生成的类。
 * jdk定义的动态代理，接口是核心。告诉JVM代理类需要实现哪些接口。JVM基于这个接口列表动态生成一个类，该类实现了所有指定的接口。
 * 这样，生成的代理类就可以被用作这些接口的实现，并且可以在这些接口定义的方法上添加自定义逻辑。
 * 这个接口列表是动态代理实现的核心，因为代理类的生成完全依赖于接口定义。
 *
 */
public class ProxyFactory {
    private TrainStation trainStation = new TrainStation();
    public SellTickets getSellTicketsProxy() {

        /*
          第一个参数：类加载器 (ClassLoader loader)
          trainStation.getClass().getClassLoader()指定了代理类的类加载器。
          代理类的类加载器必须与被代理类的类加载器兼容，否则代理类无法加载。这里使用的是trainStation对象的类加载器，确保代理类可以加载成功。

          第二个参数：接口列表 (Class<?>[] interfaces)
          trainStation.getClass().getInterfaces()获取trainStation实现的所有接口。
          代理类会实现这些接口，并具备接口定义的方法。这一参数的作用是告诉代理对象该实现哪些接口，这样在运行时，代理对象就能调用接口中定义的方法。
         前两个参数同时也是为了告诉jvm如何生成代理类，第二个接口列表是核心。
          第三个参数：调用处理器 (InvocationHandler h)
          这里是一个匿名实现的InvocationHandler接口的实例，它定义了代理对象调用方法时的行为。这也是代理类构造方法需要传递的参数
          InvocationHandler接口只有一个方法invoke，每当通过代理对象调用一个方法时，都会调用invoke方法来处理。
          this.h.invoke(this, m3, null);//这是代理类sell方法的实现，只有这一行代码，m3就是接口中的sell方法。调用invocationHandler对象中的invoke的方法

         */
        SellTickets proxyInstance = (SellTickets)Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    /*
                      Object proxy：代理对象本身。通常不用它直接调用方法，更多时候只是作为代理类的引用传递给invoke方法。
                      Method method：被调用的方法对象。例如，代理对象调用proxyInstance.sell()，则method代表SellTickets接口的sell方法。
                      Object[] args：方法的参数。当调用代理方法时，传入的参数会传递到这里。可以使用这些参数在代理方法中执行特定的操作。
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("jdk实现的动态代理类");
                        Object invoke = method.invoke(trainStation, args);
                        System.out.println("卖票方法的返回对象"+invoke);
                        return invoke;
                    }
                }

        );
        return proxyInstance;
    }
}
