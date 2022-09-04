package com.java.chapter04.day10.java2;

import javax.sound.midi.Soundbank;

/**
 * TODO this关键字的使用
 * Created by cwg on 2022/8/24
 */

/*
 * this关键字的使用：
 * 1.this可以用来修饰、调用：属性、方法、构造器
 *
 * 2.this修饰属性和方法：
 *   this理解为：当前对象  或 当前正在创建的对象
 *
 *  2.1  在类的方法中，我们可以使用"this.属性"或"this.方法"的方式，调用当前对象属性或方法。但是，
 *   通常情况下，我们都选择省略"this."。特殊情况下，如果方法的形参和类的属性同名时，我们必须显式
 *   的使用"this.变量"的方式，表明此变量是属性，而非形参。
 *
 *  2.2 在类的构造器中，我们可以使用"this.属性"或"this.方法"的方式，调用当前正在创建的对象属性或方法。
 *  但是，通常情况下，我们都选择省略"this."。特殊情况下，如果构造器的形参和类的属性同名时，我们必须显式
 *   的使用"this.变量"的方式，表明此变量是属性，而非形参。
 *
 * 3. this调用构造器
 * 	  ① 我们在类的构造器中，可以显式的使用"this(形参列表)"方式，调用本类中指定的其他构造器
 *    ② 构造器中不能通过"this(形参列表)"方式调用自己
 *    ③ 如果一个类中有n个构造器，则最多有 n - 1构造器中使用了"this(形参列表)"
 *    ④ 规定："this(形参列表)"必须声明在当前构造器的首行
 *    ⑤ 构造器内部，最多只能声明一个"this(形参列表)"，用来调用其他的构造器
 *
 */

public class PersonTest {

    public static void main(String[] args) {

        Person p1 = new Person("李四",19);

        // p1.setName("张三");
        // p1.setAge(18);

        p1.study();
        System.out.println("name = " + p1.name + ", age = " + p1.age);


    }
}

class Person {

    // 属性
    String name;
    int age;

    // 构造器
    public Person() { // 无参构造器

        System.out.println("一千行代码");
    }

    // 参数名跟属性名同名就不能省this.了
    public Person(String name) {
        this();
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        // this.name = name;
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

    // 方法
    public void eat() {
        System.out.println("人吃饭！");
        study(); // 完整应该是this.study();
    }

    public void study() {
        System.out.println("人学习!");
    }

}
