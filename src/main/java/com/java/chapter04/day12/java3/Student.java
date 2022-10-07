package com.java.chapter04.day12.java3;

/**
 * TODO
 * Created by cwg on 2022/8/29
 */
public class Student extends Person {

    String major;
    int id = 1002;


    public Student() {
        super();
    }

    public Student(String major) {
        this.major = major;
    }

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生吃饭");

        super.eat();
    }

    @Override
    public void walk() {
        System.out.println("学生走路");
    }

    public void show(){
        System.out.println("person: id = " + super.id + ", Student: id = " + id);
    }
}
