package com.java.chapter02;

/**
 * TODO 九九乘法表
 * Created by tom on 2022/8/8
 */
public class NineNineTest {

    public static void main(String[] args) {


        for (int i = 1; i <= 9; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(i + " * " + j + " = " + i * j + " ");

            }

            System.out.println();

        }

    }
}
