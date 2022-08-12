package com.java.chapter03;

/**
 * TODO 杨辉三角
 * Created by tom on 2022/8/11
 */
public class YangHuiTest {

    /*
        使用二维数组打印一个 10 行杨辉三角。 【提示】
        1. 第一行有 1 个元素, 第 n 行有 n 个元素
        2. 每一行的第一个元素和最后一个元素都是 1
        3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
            yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
     */

    public static void main(String[] args) {


        int[][] arr = new int[10][];


        for (int i = 0; i < arr.length; i++) {

            arr[i] = new int[i + 1];

            // 给第一个元素和最后一个元素赋值
            arr[i][0] = 1;
            arr[i][i] = 1;

            // 从第三行开始
            if (i > 1) {

                for (int j = 1; j < arr[i].length - 1; j++) {
                    // 从第三行开始, 对于非第一个元素和最后一个元素的元素。
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];

                }
            }
        }



        // 遍历
        for(int i = 0;i < arr.length;i++){

            for(int j = 0;j < arr[i].length;j++){

                System.out.print(arr[i][j] + " ");

            }

            System.out.println();

        }


    }

}
