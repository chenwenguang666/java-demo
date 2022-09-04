package com.java.chapter04.day14.java2;

/**
 * TODO 饿汉式
 * Created by cwg on 2022/9/1
 */

/*
 * 单例设计模式：
 * 1. 所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例。
 *
 * 2. 如何实现？
 * 	 饿汉式  vs 懒汉式
 *
 * 3. 区分饿汉式 和 懒汉式
 *   饿汉式：
 *   	坏处：对象加载时间过长。
 *   	好处：饿汉式是线程安全的
 *
 *   懒汉式：
 *         好处：延迟对象的创建。
 * 		  目前的写法坏处：线程不安全。--->到多线程内容时，再修改
 *
 *
 */
public class SingletonTest1 {

    public static void main(String[] args) {

        Bank instance1 = Bank.getInstance();
        Bank instance2 = Bank.getInstance();

        System.out.println(instance1 == instance2);

    }

}

// 饿汉式
class Bank{

    // 1.私有化构造器
    private Bank(){

    }

    // 2.声明私有化的静态的对象
    private static Bank instance = new Bank();

    // 3.通过公开的静态的方法返回对象
    public static Bank getInstance(){
        return instance;
    }

}
