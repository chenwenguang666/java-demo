package com.java.chapter02;

/**
 * TODO 数据类型演示
 * Created by cwg on 2022/4/14
 */
public class VariableTest1 {

    public static void main(String[] args) {

        // 基本数据类型

        // 1) 数值型 -> 整数类型
        // byte、short、int、long

        // byte b1 = 128; // 报错，不能定义超出这个数据类型的值
        byte b2 = 12;

        short s1 = 15;
        // 通常定义整型变量：int
        int i1 = 22;

        long l1 = 123889; // 为什么long型没加L还不会报错，因为这里涉及自动类型转换
        long l2 = 1238893424242L;

        // 2) 数值型 -> 浮点类型
        // float、doubleb
        // float 在定义的时候要使用f结尾
        float f1 = 123.3F;
        // double 是浮点型的默认类型
        double d1 = 12.3;

        // 3) 字符型
        // char
        // 两个字节
        char c1 = 'a';

        char c2 = '\n';

        char c3 = '\u0000';


        // 4) boolean 类型
        // 只有true,false
        // 一般用于流程控制
        int age = 22;
        if(age > 18){
            System.out.println("我成年了");
        }else{
            System.out.println("我没成年");
        }


    }
}
