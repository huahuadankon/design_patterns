package com.huahuadan.pattern.decorator;

/**
 * 装饰器模式的核心思想是通过组合而非继承来扩展对象的功能。
 * 通过将原始对象嵌入到装饰器对象中，装饰器对象对外表现为原始对象的增强版，同时可以保持原始对象的接口一致。
 * 这一点也是与静态代理的不同之处，虽然都可以增强目标方法，但是装饰者是由外界传递进来，可以通过构造方法传递
 * 静态代理是在代理类内部创建，以此来隐藏目标对象
 * 装饰器模式的装饰器（Egg）和基础类(FriedRice)实际上都继承同一个父类或实现同一个接口，只不过装饰器是间接继承。
 * 这种一致性保证了装饰器可以对基础类进行增强。通过将原始对象嵌入到装饰器对象中（new Egg(food);），装饰器对象对外表现为原始对象的增强版
 *
 */
public class Client {
    public static void main(String[] args) {
        //点一份炒饭
        FastFood food = new FriedRice();

        System.out.println(food.getDesc() + "  " + food.cost() + "元");

        System.out.println("===============");


        //在上面的炒饭中加一个鸡蛋
        food = new Egg(food);//这里的food运行类型已经是Egg了。只不过对外表现出FastFood类型，这就是多态。
        System.out.println(food.getDesc() + "  " + food.cost() + "元");

        System.out.println("================");
        //再加一个鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + "  " + food.cost() + "元");

        System.out.println("================");
        food = new Bacon(food);
        System.out.println(food.getDesc() + "  " + food.cost() + "元");
    }
}
