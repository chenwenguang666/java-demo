package com.java.chapter04.day15.java1;

/**
 * TODO 抽象类的匿名子类
 * Created by tom on 2022/9/5
 */
public class PersonTest {


    public static void main(String[] args) {

        //非匿名的类非匿名的对象
        Worker w1 = new Worker();
        method1(w1);

        // 非匿名的类非匿名的对象
        method1(new Worker());

        // 匿名的类匿名的对象
        method1(new Person() {
            @Override
            public void eat() {
                System.out.println("匿名的类匿名的对象吃饭");
            }

            @Override
            public void breath() {
                System.out.println("匿名的类匿名的对象呼吸");
            }
        });

    }

    public static void method1(Person p) {
        p.eat();
        p.breath();
    }

    public static void method(Student s) {

    }


}

class Worker extends Person {

    @Override
    public void breath() {
        System.out.println("工人呼吸");
    }

    @Override
    public void eat() {
        System.out.println("工人吃饭");
    }
}
