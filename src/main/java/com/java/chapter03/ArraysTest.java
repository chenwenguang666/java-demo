package com.java.chapter03;

import java.util.Arrays;

/**
 * TODO 数组工具类的使用
 *
 * java.util.Arrays:操作数组的工具类，里面定义了很多操作数组的方法
 * Created by cwg on 2022/8/18
 */
public class ArraysTest {

    public static void main(String[] args) {

        // 1.boolean equals(int[] a,int[] b):判断两个数组是否相等。
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{1,3,2,4};

        System.out.println(Arrays.equals(arr1,arr2));

        //2.String toString(int[] a):输出数组信息。
        System.out.println(Arrays.toString(arr1));


        //3.void fill(int[] a,int val):将指定值填充到数组之中。
        Arrays.fill(arr1,1);
        System.out.println(Arrays.toString(arr1));


        //4.void sort(int[] a):对数组进行排序。
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //5.int binarySearch(int[] a,int key)
        System.out.println(Arrays.binarySearch(arr2, 2));


    }
}
