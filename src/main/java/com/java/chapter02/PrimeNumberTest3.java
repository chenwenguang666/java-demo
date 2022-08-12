package com.java.chapter02;

/**
 * TODO
 * Created by tom on 2022/8/8
 */
public class PrimeNumberTest3 {


    public static void main(String[] args) {
        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long start = System.currentTimeMillis();

        int count = 0; // 记录素数的个数

        label:for(int i = 2;i <=100000;i++){

            for(int j = 2;j < Math.sqrt(i);j++){

                if(i % j == 0){
                    continue label;
                }

            }

            count++;
        }

        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long end = System.currentTimeMillis();
        System.out.println("质数的个数为：" + count);
        System.out.println("所花费的时间为：" + (end - start));
    }
}
