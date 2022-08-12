package com.java.chapter02;

/**
 * TODO while测试
 * Created by tom on 2022/8/8
 */
public class WhileTest {

    public static void main(String[] args){

        //遍历100以内的所有偶数，及偶数的和、偶数的个数

        int i = 1;
        int sum = 0;
        int count = 0;

        while(i <= 100){

            if(i % 2 == 0){

                System.out.println(i);
                sum += i;
                count++;
            }

            i++;
        }

        System.out.println("偶数的和：" + sum);
        System.out.println("偶数的个数：" + count);
    }
}
