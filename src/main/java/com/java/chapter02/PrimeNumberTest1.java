package com.java.chapter02;

/**
 * TODO 素数1.0
 * Created by tom on 2022/8/8
 */
public class PrimeNumberTest1 {

    public static void main(String[] args) {
        /*
            100以内的所有质数的输出。
            质数：素数，只能被1和它本身整除的自然数。-->从2开始，到这个数-1结束为止，都不能被这个数本身整除。

            最小的质数是：2
        */

        //
        boolean isFlag = true; // 标识i是否被j除尽，一旦除尽，修改其值

        for(int i = 2;i <=100;i++){

            for(int j = 2;j < i;j++){

                if(i % j == 0){

                    isFlag = false;

                }

            }

            // 判断Flag有没有变化，测出i这个数有没有被整除
            if(isFlag){
                System.out.println(i);
            }

            isFlag = true;

        }

    }
}
