package com.java.chapter03;

/**
 * TODO 数组常异常
 * Created by cwg on 2022/8/18
 */
public class ArrayExceptionTest {

    public static void main(String[] args) {

        //1. 数组角标越界的异常：ArrayIndexOutOfBoundsException
        int[] arr = new int[]{1,2,3,4,5};

        /*for(int i = 0;i <= arr.length;i++){

            System.out.print(arr[i] + "\t");

        }*/

        // System.out.println(arr[5]); 越界


        //2. 空指针异常：NullPointerException
        //情况一：
        // int[] arr1 = new int[]{1,2,3};
        // arr1 = null;
        // System.out.println(arr1[0]);

        //情况二：
        int[][] arr2 = new int[3][];
        // System.out.println(arr2[0][0]);

        //情况三：
        String[] arr3 = {"AA","BB","CC"};
        arr3[0] = null;
        // System.out.println(arr3[0].toString());



    }

}
