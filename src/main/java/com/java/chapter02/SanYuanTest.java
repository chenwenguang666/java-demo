package com.java.chapter02;

/**
 * TODO
 * Created by tom on 2022/8/8
 */
public class SanYuanTest {

    public static void main(String[] args){

        /*
         三元运算符

         1.结构：(条件表达式)? 表达式1 : 表达式2
         2. 说明
            ① 条件表达式的结果为boolean类型
            ② 根据条件表达式真或假，决定执行表达式1，还是表达式2.
              如果表达式为true，则执行表达式1。
              如果表达式为false，则执行表达式2。
            ③ 表达式1 和表达式2要求是一致的。
            ④ 三元运算符可以嵌套使用

        3.
        凡是可以使用三元运算符的地方，都可以改写为if-else
        反之，不成立。

        4. 如果程序既可以使用三元运算符，又可以使用if-else结构，那么优先选择三元运算符。原因：简洁、执行效率高。
         */


        // 获取两个数的最大值

        int i1 = 100;
        int i2 = 200;

        int result = (i1 > i2 )? i1 : i2;

        System.out.println(result);
    }
}
