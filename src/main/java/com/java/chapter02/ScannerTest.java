package com.java.chapter02;

/**
 * TODO Scanner类测试
 * Created by tom on 2022/8/8
 */

// 1.导包
import java.util.Scanner;
public class ScannerTest {

    public static void main(String[] args){

        // 2. 实例化Scanner对象
        Scanner scan = new Scanner(System.in);

        // 3.调用Scanner类的相关方法
        System.out.println("请输入你的姓名");
        String name = scan.next(); // 输入字符串

        System.out.println("请输入你的年龄");
        int age = scan.nextInt();

        System.out.println("请输入你的体重");
        double weight = scan.nextDouble();

        System.out.println("请输入你的性别(true/false)");
        boolean sex = scan.nextBoolean();


        System.out.println("姓名：" + name + ", 年龄：" + age + ", 体重：" + weight + ", 性别： " + sex);


        // Scanner获取char类型
        //对于char型的获取，Scanner没有提供相关的方法。只能获取一个字符串
        System.out.println("获取char");
        char c1 = scan.next().charAt(0); // 获取第一个字符
        System.out.println(c1);


    }
}
