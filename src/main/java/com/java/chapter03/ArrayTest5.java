package com.java.chapter03;

/**
 * TODO 算法的考查：求数值型数组中元素的最大值、最小值、平均数、总和等
 * Created by tom on 2022/8/11
 */
public class ArrayTest5 {

    /*
            算法的考查：求数值型数组中元素的最大值、最小值、平均数、总和等

            定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
            然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
            要求：所有随机数都是两位数。

            [10,99] [a,b]  -> (数据类型)(Math.random() * (b - a + 1) + 10)
            公式：(int)(Math.random() * (99 - 10 + 1) + 10)

     */

    public static void main(String[] args) {

        int[] arr = new int[10];

        for(int i = 0;i < arr.length;i++){
            arr[i] = (int)(Math.random() * (99 - 10 + 1) + 10);
        }

        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();



        // 最大值
        int max = 0;
        for(int i = 0;i < arr.length;i++){

            if(arr[i] > max){
                max = arr[i];
            }

        }

        System.out.println(max);


        // 最小值
        int min = arr[0];
        for(int i = 0;i < arr.length;i++){

            if(arr[i] < min){
                min = arr[i];
            }

        }

        System.out.println(min);

        // 总和
        int sum = 0;

        for(int i = 0;i < arr.length;i++){

            sum += arr[i];

        }

        System.out.println(sum);


        // 平均值，在总和的基础上除以元素的个数
        int avg = sum / arr.length;

        System.out.println(avg);




    }
}
