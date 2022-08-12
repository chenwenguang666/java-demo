package com.java.chapter02;

/**
 * TODO 嵌套循环测试
 * Created by tom on 2022/8/8
 */
public class ForForTest {

    public static void main(String[] args) {

        // 案例一：
        /*			i(行号)		j(*的个数)

         *			0           1
         **			1           2
         ***		2           3
         ****		3           4
         *****		4           5

         */

        for(int i = 0;i < 5;i++){

            for(int j = 0;j <= i ;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        // 案例二：
        /*			i(行号)		j(*的个数)         j = 4 - i

         ****		0           4
         ***		1           3
         **			2           2
         *			3           1

         */


        for(int i = 0;i < 4;i++){

            for(int j = 0;j < 4 - i;j++){

                System.out.print("*");

            }

            System.out.println();

        }



        // 上述代码两个循环拼起来就等于
        /*

         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *

         */


    }
}
