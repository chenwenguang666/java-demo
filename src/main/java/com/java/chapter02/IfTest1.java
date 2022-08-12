package com.java.chapter02;

/**
 * TODO if-else测试
 * Created by tom on 2022/8/8
 */

    /*
    分支结构中的if-else（条件判断结构）


    一、三种结构

    第一种：
    if(条件表达式){
        执行表达式
    }

    第二种：二选一
    if(条件表达式){
        执行表达式1
    }else{
        执行表达式2
    }

    第三种：n选一
    if(条件表达式){
        执行表达式1
    }else if(条件表达式){
        执行表达式2
    }else if(条件表达式){
        执行表达式3
    }
    ...
    else{
        执行表达式n
    }

*/
public class IfTest1 {

    public static void main(String[] args){

        // 第一种举例：
        int age = 22;

        if(age >= 18){
            System.out.println("你已经成年了！");
        }


        // 第二种举例：
        if(age >= 18){
            System.out.println("成年了，就应该看点成人电影！");
        }else{
            System.out.println("你还未成年，多看点动画片吧！");
        }


        // 第三种举例： 这种举例age是存在包含关系的

        if(age < 18){
            System.out.println("你还未成年呢！");
        }else if(age < 35){
            System.out.println("青少年时期");
        }else if(age < 60){
            System.out.println("中年时期");
        }else if(age < 120){
            System.out.println("老年时期");
        }else{
            System.out.println("你要成仙呢！");
        }

    }
}
