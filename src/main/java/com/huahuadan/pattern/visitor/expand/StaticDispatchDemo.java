package com.huahuadan.pattern.visitor.expand;

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

/**
 * 1. 静态分派
 * 静态分派是在编译期决定调用的具体方法，它通常发生在方法的重载过程中。编译器根据方法的参数类型、参数个数和方法签名来确定要调用的方法。
 * 静态分派的选择在编译时就完成了，因此称为静态。
 * 原理：编译器通过方法签名匹配适合的重载方法。这种分派只基于变量的静态类型（也称为编译时类型），而不是它的实际类型。
 */
public class StaticDispatchDemo {
    public void greet(Animal animal) {
        System.out.println("Hello, Animal!");
    }

    public void greet(Dog dog) {
        System.out.println("Hello, Dog!");
    }

    public void greet(Cat cat) {
        System.out.println("Hello, Cat!");
    }

    public static void main(String[] args) {
        StaticDispatchDemo demo = new StaticDispatchDemo();
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // 根据静态类型（编译期类型）选择方法
        demo.greet(animal1); // 输出 "Hello, Animal!"
        demo.greet(animal2); // 输出 "Hello, Animal!"
    }
}
