package com.java.chapter02;

/**
 * TODO If测试：获取一个随机数
 * Created by tom on 2022/8/8
 */
public class IfTest3 {


    public static void main(String[] args){

        // 获取一个随机数：
        // 通过Math类的random()  =>  [0.0.1.0) 默认初始范围

        double random = Math.random();
        System.out.println(random);

        // 同过上述，获取10 - 99范围
        // 根据公式凑出来： 公式：[a,b]  :  (int)(Math.random() * (b - a + 1) )+ a

        int value  = (int)(Math.random() * (99 - 10 + 1))  + 10;

        System.out.println(value);

    }
}
