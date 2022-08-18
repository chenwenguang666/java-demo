package com.java.chapter03;

/**
 * TODO 冒泡排序
 * Created by cwg on 2022/8/18
 */
public class BubbleSortTest {

    public static void main(String[] args) {

        int[] arr = new int[]{43,32,76,-98,0,64,33,-21,32,99};

        // 控制排序多少轮
        for(int i = 0;i < arr.length - 1;i++){

            // 每一轮 其中每个元素进行比较
            for(int j = 0;j < arr.length - 1 - i;j++){

                // 比较、交换
                if(arr[j] > arr[j + 1]){

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }

        // 打印
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();


    }
}
