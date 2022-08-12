package com.java.chapter02;

/**
 * TODO for测试1
 * Created by tom on 2022/8/8
 */
public class ForTest1 {

    public static void main(String[] args){

        // 例题：遍历100以内的偶数,输出所有偶数的和,输出偶数的个数
        int sum = 0;
        int count = 0;

        for(int i = 1;i <= 100;i++){

            if(i % 2 == 0){
                sum += i;
                count++;
            }
        }

        System.out.println("偶数和：" + sum);
        System.out.println("偶数的个数： " + count);

    }
}
