package com.java.chapter02;

import java.sql.SQLOutput;

/**
 * TODO do-while测试
 * Created by tom on 2022/8/8
 */
public class DoWhileTest {


    public static void main(String[] args) {


        // 遍历100以内的偶数,并计算所有偶数的和及偶数的个数

        int i = 1;
        int sum = 0;
        int count = 0;


        do {
            if (i % 2 == 0) {

                System.out.println(i);
                sum += i;
                count++;
            }

            i++;


        } while (i <= 100);


        System.out.println("偶数的总和为：" + sum);
        System.out.println("偶数的个数为：" + count);


        // 体会do while至少执行一次
        int i1 = 1;

        do {

            System.out.println("do while 至少执行一次测试");

            i1++;


        } while (i1 > 100); // 不满足循环的条件


    }


}
