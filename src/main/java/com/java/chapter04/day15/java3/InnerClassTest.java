package com.java.chapter04.day15.java3;

/**
 * TODO 内部类测试
 * Created by tom on 2022/9/6
 */

/*
 * 类的内部成员之五：内部类
 * 1. Java中允许将一个类A声明在另一个类B中，则类A就是内部类，类B称为外部类
 *
 * 2.内部类的分类：成员内部类（静态、非静态）  vs 局部内部类(方法内、代码块内、构造器内)
 *
 * 3.成员内部类：
 * 		一方面，作为外部类的成员：
 * 			>调用外部类的结构
 * 			>可以被static修饰
 * 			>可以被4种不同的权限修饰
 *
 * 		另一方面，作为一个类：
 * 			> 类内可以定义属性、方法、构造器等
 * 			> 可以被final修饰，表示此类不能被继承。言外之意，不使用final，就可以被继承
 * 			> 可以被abstract修饰
 *
 *
 * 4.关注如下的3个问题
 *   4.1 如何实例化成员内部类的对象
 *   4.2 如何在成员内部类中区分调用外部类的结构
 *   4.3 开发中局部内部类的使用  见《InnerClassTest1.java》
 *
 */

public class InnerClassTest {

    public static void main(String[] args) {

        // 1.创建静态内部类的实例
        Person.Dog dog = new Person.Dog();
        dog.show();

        // 2.创建非静态内部类的实例
        Person person = new Person();
        Person.Bird bird = person.new Bird();
        bird.sing();
        bird.display("卢本伟");


    }

}


class Person {

    String name = "小明";
    int age;

    public void eat() {
        System.out.println("人：吃饭");
    }

    public static void walk(){
        System.out.println("人走路");
    }

    // 静态成员内部类
    static class Dog {

        String name;
        int age;

        public Dog() {

        }

        public void show() {
            System.out.println("卡拉是条狗");
            // eat();
            walk();

        }

    }

    // 非静态成员内部类
    class Bird {

        String name = "杜鹃";

        public Bird() {

        }

        public void sing() {
            System.out.println("我是一只小小鸟");
            //调用外部类的非静态属性
            Person.this.eat();
            eat();
            System.out.println(age);

        }

        public void display(String name){
            System.out.println(name);//方法的形参
            System.out.println(this.name);//内部类的属性
            System.out.println(Person.this.name);//外部类的属性
        }

    }

    // 方法内的 局部内部类
    public void method() {

        class AA {

        }
    }

    // 代码块的 局部内部类
    {
        class BB {

        }
    }


    // 构造器的 局部内部类
    public Person() {
        class CC {

        }
    }

}
