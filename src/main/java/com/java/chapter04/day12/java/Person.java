package com.java.chapter04.day12.java;

/**
 * TODO
 * Created by cwg on 2022/8/29
 */
public class Person {

    String name;
    int age ;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void eat(){
        System.out.println("人吃饭");
    }

    public void sleep(){
        System.out.println("人睡觉");
    }

    // 私有的方法不存在重写
    private  void  method(){
        System.out.println("我是一个人");
    }

    protected void method2(){

    }


}
