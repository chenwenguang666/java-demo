package com.java.chapter04.day09.java;

/**
 * TODO 自定义数组的工具类
 * Created by cwg on 2022/8/23
 */
public class ArraysUtil {

    // 求数组的最大值
    public int getMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }

        return max;
    }

    // 求数组的最小值
    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

        }

        return min;
    }

    // 求数组的总和
    public int getSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

        }

        return sum;
    }


    // 求数组的平均值
    public int getAvg(int[] arr) {

        return getSum(arr) / arr.length;
    }

    // 复制数组
    public int[] copyArr(int[] arr) {

        int[] arr2 = new int[arr.length];
        // 循环给一个新的变量赋值
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        return arr2;
    }

    // 数组排序
    public void sortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            // 每一轮 其中每个元素进行比较
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // 比较、交换
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }


    // 遍历数组
    public void printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println();
    }


    // 查找指定元素
    public int search(int[] arr, int dest) {


        for (int i = 0; i < arr.length; i++) {

            if (dest == arr[i]) {
                return i;
            }
        }

        return -1;
    }


}
