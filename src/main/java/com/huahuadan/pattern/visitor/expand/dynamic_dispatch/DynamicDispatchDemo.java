package com.huahuadan.pattern.visitor.expand.dynamic_dispatch;

/**
 * 2. 动态分派
 * 动态分派发生在运行时，主要用于方法的重写。动态分派通过对象的实际类型来决定调用哪个方法，因此可以在运行时根据实际类型调用相应的重写方法。
 * 原理：JVM在运行时会根据实际对象的类型（不是引用的静态类型）来决定要调用的方法，这就是动态绑定或后期绑定。
 */
class Animal {
    public void speak() {
        System.out.println("Animal speaks.");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Cat meows.");
    }
}

public class DynamicDispatchDemo {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // 根据实际类型（运行时类型）选择方法
        animal1.speak(); // 输出 "Dog barks."
        animal2.speak(); // 输出 "Cat meows."
    }
}
