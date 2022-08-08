package com.java.chapter02;

/**
 * TODO 编码时的注意点
 * Created by tom on 2022/8/2
 */
public class VariableTest4 {

    public static void maim(String[] args){

        // 情况一：过大的整数
        // long在一般情况下，是要以L结尾的， 但是根据自动类型提升int类型的值也能赋值给long
        long l1 = 1234567;

        // 但是在超出int类型的范围时，就需要以L结尾了。
        // 整型类型默认类型为int
        // long l2 = 5645489489486486;  过大的整数

        // 浮点型则不行，浮点型默认类型为double
        // float f1 = 12.3; error


        // 情况二：与常量值运算

        byte b1 = 12;
        // 1为 int类型，不满足自动类型提升
        // byte b2 = b1 + 1; error



    }
}
