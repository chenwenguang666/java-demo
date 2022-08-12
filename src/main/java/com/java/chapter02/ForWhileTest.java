package com.java.chapter02;

import java.util.Scanner;

/**
 * TODO 无限循环测试
 * Created by tom on 2022/8/8
 */
public class ForWhileTest {


    public static void main(String[] args) {

        /*
        题目：
            从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。
        */

        int positiveNumber = 0; //记录正数的个数
        int negativeNumber = 0; //记录负数的个数

        for(;;){

            Scanner scan = new Scanner(System.in);

            System.out.println("请输入一个数，输入0结束！");
            int temp = scan.nextInt();

            if(temp > 0){
                positiveNumber++;
            }else if(temp < 0){
                negativeNumber++;
            }else {
                break;
            }

        }


        System.out.println("正数的个数为：" + positiveNumber);
        System.out.println("负数的个数为：" + negativeNumber);

    }
}
