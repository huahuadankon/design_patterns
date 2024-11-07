package com.huahuadan.pattern.proxy.jdk_dynamic_proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * 阿里巴巴开源的 Java 诊断工具所诊断到的动态代理的代理类,删掉了一些不必要的参数和方法
 */

public final class $Proxy0 extends Proxy implements SellTickets {
    private static Method m3;
    public $Proxy0(InvocationHandler invocationHandler) {
        super(invocationHandler);//就是newProxyInstance这个方法的第三个参数所传递的一个匿名内部类。
    }
    static {
        try {
            //反射得到sell方法
            m3 = Class.forName("com.huahuadan.jdk.dynamic.proxy.SellTickets").getMethod("sell", new Class[0]);
        }catch (Exception e){
            throw new UndeclaredThrowableException(e);
        }

    }

    public final void sell() {
        try {
            this.h.invoke(this, m3, null);//调用invocationHandler对象中的invoke的方法
            //new InvocationHandler() {
            //                    @Override
            //                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            //                        System.out.println("jdk实现的动态代理类");
            //                        Object invoke = method.invoke(trainStation, args);
            //                        System.out.println("卖票方法的返回对象"+invoke);
            //                        return invoke;
            //                    }
            //                }
        }
        catch (Error | RuntimeException throwable) {
            throw throwable;
        }
        catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }
}