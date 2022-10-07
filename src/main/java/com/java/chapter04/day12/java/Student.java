package com.java.chapter04.day12.java;

/**
 * TODO
 * Created by cwg on 2022/8/29
 */
public class Student extends Person {

    String major;

    public Student(String major) {
        this.major = major;
    }


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // 方法的重写
    public void eat() {
        System.out.println("学生应该吃有营养的食物！");
    }

    // 方法的重写
    public void sleep() {
        System.out.println("学生应该睡8个小时");
    }


    private  void  method(){
        System.out.println("我是一个学生");
    }

    // 子类的权限修饰符范围 不大于 父类的权限修饰符范围
    protected void method2(){

    }

    /// 不是重写
    public static void method3(){

    }


}
