package com.java.chapter02;

/**
 * TODO 素数2.0
 * Created by tom on 2022/8/8
 */
public class PrimeNumberTest2 {

    public static void main(String[] args) {


        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long start = System.currentTimeMillis();



        boolean isFlag = true; // 标识i是否被j除尽，一旦除尽，修改其值
        int count = 0; // 记录素数的个数

        for(int i = 2;i <=100000;i++){

            for(int j = 2;j < i;j++){

                if(i % j == 0){

                    isFlag = false;
                    break;

                }

            }

            // 判断Flag有没有变化，测出i这个数有没有被整除
            if(isFlag){
//                System.out.println(i);
                count++;
            }

            isFlag = true;

        }

        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long end = System.currentTimeMillis();
        System.out.println("质数的个数为：" + count);
        System.out.println("所花费的时间为：" + (end - start));
    }
}
