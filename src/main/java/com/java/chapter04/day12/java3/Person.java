package com.java.chapter04.day12.java3;

/**
 * TODO
 * Created by cwg on 2022/8/29
 */
public class Person {

    String name;
    int age;
    int id = 1001;

    public Person() {
        super();
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("人吃饭");

        walk();
    }

    public void walk() {
        System.out.println("人走路");
    }


}
