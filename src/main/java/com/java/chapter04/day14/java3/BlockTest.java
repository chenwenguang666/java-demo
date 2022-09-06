package com.java.chapter04.day14.java3;

/**
 * TODO 代码块测试
 * Created by cwg on 2022/9/2
 */

/*
 * 类的成员之四：代码块（或初始化块）
 *
 * 1. 代码块的作用：用来初始化类、对象
 * 2. 代0码块如果有修饰的话，只能使用static.
 * 3. 分类：静态代码块  vs 非静态代码块
 *
 * 4. 静态代码块
 * 	   >内部可以有输出语句
 * 	   >随着类的加载而执行,而且只执行一次
 * 	   >作用：初始化类的信息
 * 	   >如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
 * 	   >静态代码块的执行要优先于非静态代码块的执行
 * 	   >静态代码块内只能调用静态的属性、静态的方法，不能调用非静态的结构
 *
 * 5. 非静态代码块
 * 		>内部可以有输出语句
 * 		>随着对象的创建而执行
 * 		>每创建一个对象，就执行一次非静态代码块
 * 		>作用：可以在创建对象时，对对象的属性等进行初始化
 * 		>如果一个类中定义了多个非静态代码块，则按照声明的先后顺序执行
 * 		>非静态代码块内可以调用静态的属性、静态的方法，或非静态的属性、非静态的方法
 *
 */

public class BlockTest {

    public static void main(String[] args) {


        Person p1 = new Person();


        Person p2 = new Person();


    }

}


class Person {
    String name;
    int age;
    static String nation;

    // 静态代码块
    static {
        nation = "中国";
        method2();
        System.out.println("静态代码块");

        // 静态代码块不能使用非静态的结构
//        name = "fdf";
//        method();


    }

    // 非静态代码块
    {
        name = "fdsfd";
        age = 12;
        method1();
        System.out.println("非静态代码块");

        //调用静态的结构
        method2();
        nation = "china";

    }


    public void method1(){
        System.out.println("method1");
    }

    public static void method2(){
        System.out.println("method2");
    }

}