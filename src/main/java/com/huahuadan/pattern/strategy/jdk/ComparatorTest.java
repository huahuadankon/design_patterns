package com.huahuadan.pattern.strategy.jdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // 按年龄排序
        Comparator<Person> ageComparator = Comparator.comparingInt(person -> person.age);
        Collections.sort(people, ageComparator);
        System.out.println("Sorted by age: " + people);

        // 按姓名排序
        Comparator<Person> nameComparator = Comparator.comparing(person -> person.name);
        Collections.sort(people, nameComparator);
        System.out.println("Sorted by name: " + people);
    }
}
