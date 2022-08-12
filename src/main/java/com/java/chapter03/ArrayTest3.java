package com.java.chapter03;

/**
 * TODO 二维数组的使用
 * Created by tom on 2022/8/11
 */
public class ArrayTest3 {

    /*
      2. 二维数组的使用:
          ① 二维数组的声明和初始化
          ② 如何调用数组的指定位置的元素
          ③ 如何获取数组的长度
          ④ 如何遍历数组
          ⑤ 数组元素的默认初始化值 :见 ArrayTest4.java
          ⑥ 数组的内存解析 :见 ArrayTest4.java
     */

    public static void main(String[] args) {

        // ① 二维数组的声明和初始化
        // 一维数组的静态初始化
        int[] arr1 = new int[]{1, 2, 3};

        // 1.1 二维数组的静态初始化
        int[][] arr2 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};
        // 静态初始化之类型推断
        int[][] arr21 = {{1, 2, 3}, {4, 5}, {6, 7, 8}};


        // 1.2 二维数组的动态初始化
        // 动态初始化1
        int[][] arr3 = new int[3][];
        // 动态初始化2
        int[][] arr4 = new int[3][4];

        //错误的情况
//		String[][] arr4 = new String[][4];
//		String[4][3] arr5 = new String[][];
//		int[][] arr6 = new int[4][3]{{1,2,3},{4,5},{6,7,8}};


        // ② 如何调用数组的指定位置的元素
        // 通过下标
        System.out.println(arr2[0][1]);// 2
        System.out.println(arr2[1][0]);// 4


        // ③ 如何获取数组的长度
        System.out.println(arr2.length);
        System.out.println(arr2[0].length);
        System.out.println(arr2[1].length);


        // ④ 如何遍历数组
        // 循环
        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2[i].length; j++) {

                if (j == arr2[i].length - 1) {
                    System.out.print(arr2[i][j]);
                } else {
                    System.out.print(arr2[i][j] + ",");
                }

            }

            System.out.println();
        }


    }
}
