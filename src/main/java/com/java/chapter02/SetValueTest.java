package com.java.chapter02;

/**
 * TODO 赋值运算符测试
 * Created by tom on 2022/8/8
 */
public class SetValueTest {


    public static void main(String[] args){

        /*
            = ：赋值符
            +=
            -=
            *=
            /=
            %=

         */

        // 赋值 ，把10赋值给i
        int i = 10;
        int j = 20;

        // 连续赋值
        int i2,j2;
        i2 = j2 = 10;

        int i3 = 10,j3 = 20;


        // += ：
        int num1 = 10;
        num1 += 1; // 相当于 num1 = num1 + 1;
        System.out.println(num1);

        // 其余的同理


        // 辨析 赋值运算符  和  byte i = i + 1

        byte a = 12;
        a += 1; // 结论：不会改变变量本身的数据类型
        System.out.println(a);

        byte b = 12;
        // b = b + 1; error，编译失败不满足自动类型提升
        // System.out.println(b);



    }
}
