package com.huahuadan.pattern.decorator;

/**
 * 装饰器模式的核心思想是通过组合而非继承来扩展对象的功能。
 * 通过将原始对象嵌入到装饰器对象中，装饰器对象对外表现为原始对象的增强版，同时可以保持原始对象的接口一致。
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
        food = new Egg(food);
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
