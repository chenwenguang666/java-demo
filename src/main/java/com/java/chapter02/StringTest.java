package com.java.chapter02;

/**
 * TODO 字符串测试
 * Created by tom on 2022/8/2
 */
public class StringTest {


    public static void main(String[] args){

        // 1) String属于引用数据类型,翻译为：字符串
        // 2) 声明String类型变量时，使用一对""
        // 3) String可以和8种基本数据类型变量做运算，且运算只能是连接运算：+
        // 4) 运算的结果仍然是String类型

        // 字符串的定义
        String s1 = ""; // 空字符串

        String s2 = "hello";

        // 与char区分
        char c1 = 'a'; // 有且仅有一个
        // char c2 = ''; //error


        // 与字符串运算
        int i1 = 12;
        double d2 = 12.3;
        char c3 = 'A';
        String s3 = "Hello,world!";

        System.out.println(s3 + i1 + d2 + c3); // 结果为String类型

        String s4 = "12.3";
        //double d3 = (double)s4; // Inconvertible types; cannot cast 'java.lang.String' to 'double'
        double d4 = Double.parseDouble(s4); // 通过包装类转化
        System.out.println(d4);


    }
}
