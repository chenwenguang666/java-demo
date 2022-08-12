package com.java.chapter02;

/**
 * TODO 算术运算符测试
 * Created by tom on 2022/8/2
 */
public class AriTest {


    public static void main(String[] args){

        /*
        运算符之一：算术运算符
        +(正号)
        -(负号)
        +(加)
        -(减)
        *(乘)
        /(除)
        %(取模)
        (前)++
        (后)++
        (前)--
        (后)--
        +(连接符)

         */

        // 除号： /

        int num1 = 12;
        int num2 = 5;

        // 案例
        System.out.println(num1 / num2);// 2
        System.out.println(num1 / num2 * num2);// 10

        double  d1 = num1 / num2;
        System.out.println(d1);// 2.0

        // 如需要结果变为2.4，则需要接收类型为double， 并且num1 或 num2其中一个类型为double
        double d2 = (double)num1 / num2;
        System.out.println(d2);


        // 取模： %
        //结果的符号与被模数的符号相同
        int m1 = 12;
        int n1 = 5;
        System.out.println("m1 % n1 = " + m1 % n1);

        int m2 = -12;
        int n2 = 5;
        System.out.println("m2 % n2 = " + m2 % n2);

        int m3 = 12;
        int n3 = -5;
        System.out.println("m3 % n3 = " + m3 % n3);

        int m4 = -12;
        int n4 = -5;
        System.out.println("m4 % n4 = " + m4 % n4);


        // ++在前：先自增1，后运算
        // ++在后：先运算，后自增1

        // ++ 在后
        int a1 = 10;
        int b1 = a1++;
        System.out.println("a1 = " + a1 + " , b1 = " + b1);

        // ++ 在前
        int a2 = 10;
        int b2 = ++a2;
        System.out.println("a2 = " + a2 + " , b2 = " + b2);

        // i++
        // 这样写，就是x + 1的意思
        int a3 = 10;
        a3++;
        System.out.println("a3 = " + a3);


        // 辨析 i++ 与 i = i + 1
        byte i = 10;
        i++;
        System.out.println(i); // 11 没问题

        byte i2 = 10;
        // byte i3 = i2 + 1; // error,不满足自动类型提升

        // --在前：先自减1，后运算
        // --在后：先运算，再自减1


    }
}
