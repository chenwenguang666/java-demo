package com.java.chapter04.day08.java;

/**
 * TODO 设计类，就是设计类的成员
 * Created by cwg on 2022/8/23
 */

/*
 * 一、设计类，其实就是设计类的成员
 *
 *  属性 = 成员变量 = field = 域、字段
 *  方法 = 成员方法 = 函数 = method
 *
 *  创建类的对象 = 类的实例化 = 实例化类
 *
 * 二、类和对象的使用（面向对象思想落地的实现）：
 *  1.创建类，设计类的成员
 *  2.创建类的对象
 *  3.通过“对象.属性”或“对象.方法”调用对象的结构
 *
 * 三、如果创建了一个类的多个对象，则每个对象都独立的拥有一套类的属性。（非static的）
 *   意味着：如果我们修改一个对象的属性a，则不影响另外一个对象属性a的值。
 *
 * 四、对象的内存解析
 */
public class PersonTest {

    public static void main(String[] args) {

        // 创建p1对象
        Person p1 = new Person();
        // 对象.属性
        p1.name = "张三";
        System.out.println("姓名：" + p1.name + ", 年龄：" + p1.age + ", 性别：" + p1.isMale);

        // 对象.方法
        p1.eat();
        p1.sleep();
        p1.talk("蒙山话");

        // 创建p2对象
        // 如果创建了一个类的多个对象，则每个对象都独立的拥有一套类的属性。（非static的）
        Person p2 = new Person();

        p2.name = "李四";
        p2.age = 22;
        p2.isMale = true;

        System.out.println("姓名：" + p2.name + ", 年龄：" + p2.age + ", 性别：" + p2.isMale);


        //将p1变量保存的对象地址值赋给p3,导致p1和p3指向了堆空间中的同一个对象实体。
        Person p3 = p1;

        p3.name = "王五";
        p3.age = 66;

        System.out.println("姓名：" + p1.name + ", 年龄：" + p1.age + ", 性别：" + p1.isMale);


    }

}


class Person{

    // 属性
    String name;
    int age = 10; // 在类中就初始化了
    boolean isMale;

    // 方法
    public void eat(){
        System.out.println("人可以吃饭！");
    }

    public void sleep(){
        System.out.println("人可以睡觉！");
    }

    public void talk(String language){
        System.out.println("人们说话的语言是" + language);
    }

}
