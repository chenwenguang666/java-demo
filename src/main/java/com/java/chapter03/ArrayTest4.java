package com.java.chapter03;

/**
 * TODO 二维数组的默认初始化值
 * Created by tom on 2022/8/11
 */
public class ArrayTest4 {

    /*
    二维数组的使用：
        规定：二维数组分为外层数组的元素，内层数组的元素
            int[][] arr = new int[4][3];
            外层元素：arr[0],arr[1]等
            内层元素：arr[0][0],arr[1][2]等

  ⑤ 数组元素的默认初始化值
      针对于初始化方式一：比如：int[][] arr = new int[4][3];
         外层元素的初始化值为：地址值
         内层元素的初始化值为：与一维数组初始化情况相同

      针对于初始化方式二：比如：int[][] arr = new int[4][];
        外层元素的初始化值为：null
         内层元素的初始化值为：不能调用，否则报错。

  ⑥ 数组的内存解析
     */

    public static void main(String[] args) {

        // 二维数组的默认初始化值
        // 动态初始化一：
        System.out.println("============= int =============");
        int[][] arr1 = new int[3][4];

        System.out.println(arr1[0]);// 地址值
        System.out.println(arr1[1]);// 地址值
        System.out.println(arr1[2]);// 地址值

        System.out.println(arr1[0][0]);// 0
        System.out.println(arr1[0][1]);
        System.out.println(arr1[0][2]);
        System.out.println(arr1[0][3]);

        System.out.println("============= String =============");
        String[][] arr2 = new String[3][4];

        System.out.println(arr2[0]);// 地址值
        System.out.println(arr2[1]);// 地址值
        System.out.println(arr2[2]);// 地址值

        System.out.println(arr2[0][0]);// null
        System.out.println(arr2[0][1]);
        System.out.println(arr2[0][2]);
        System.out.println(arr2[0][3]);

        // 动态初始化二：
        int[][] arr3 = new int[3][];

        System.out.println(arr3[0]);// 地址值
        System.out.println(arr3[1]);// 地址值
        System.out.println(arr3[2]);// 地址值

        // System.out.println(arr3[0][0]);// error 空指针




    }


}
