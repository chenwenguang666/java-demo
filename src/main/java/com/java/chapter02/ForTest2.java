package com.java.chapter02;

import java.util.Scanner;

/**
 * TODO for测试2
 * Created by tom on 2022/8/8
 */
public class ForTest2 {

    public static void main(String[] args) {

        /*
        题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
        比如：12和20的最大公约数是4，最小公倍数是60。

        说明：break关键字的使用：一旦在循环中执行到break，就跳出循环

        */

        Scanner scan = new Scanner(System.in);

        System.out.println("输入第一个参数：");
        int m = scan.nextInt();

        System.out.println("输入第二个参数");
        int n = scan.nextInt();


        // 最大公约数
        // 1.获取两个数中的最小值
        int min = (m <= n)? m : n;

        for(int i = min;i >= 1;i--){

            if(m % i == 0 && n % i == 0){
                System.out.println("最大公约数： " + i);
                break;
            }

        }


        // 最小公倍数
        // 1.获取两个数中的最大值
        int max = (m >= n)? m : n;

        for(int i = max;i <= m * n;i++){

            if(i % m == 0 && i % n == 0){
                System.out.println("最小公倍数：" + max);
                break;
            }
        }

    }
}
