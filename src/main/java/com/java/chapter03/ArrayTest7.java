package com.java.chapter03;

/**
 * TODO 数组的复制（与数组的赋值区分）、反转、查找
 * Created by cwg on 2022/8/18
 */
public class ArrayTest7 {

    public static void main(String[] args) {

        // 数组的复制
        String[] arr = new String[]{"JJ","DD","MM","BB","GG","AA"};

        String[] arr2 = new String[arr.length];
        // 循环给一个新的变量赋值
        for(int i = 0;i < arr.length;i++){
            arr2[i] = arr[i];
        }


        // 数组的反转（两种方法）
        // 方法一：迭代到半数之前都交换
        /*for(int i = 0;i < arr.length / 2;i++){

            String temp = arr[i];
            arr[i] = arr[arr.length -i - 1];
            arr[arr.length -i - 1] = temp;

        }*/

        // 方法二：控制两个游标
        /*for(int i=0,j = arr.length - 1;i < j;i++,j--){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }*/

        // 打印
        for(int i = 0;i < arr.length;i++){

            System.out.print(arr[i] + "\t");

        }

        System.out.println();


        // 3.查找
        // 3.1 线性查找(按照顺序查找)

        String dest = "bB";
        boolean flag = false;// 打一个标志，判断有没有找到

        for(int i = 0;i < arr.length;i++){

            if(dest.equals(arr[i])){

                System.out.println("找到了，索引位置为：" + i);
                flag = true;
                break;
            }

        }

        if(!flag){
            System.out.println("很遗憾没有找到！");
        }


        // 二分查找
        // 前提：所要查找的数组必须有序。
        int[] arr3 = new int[]{-98,-34,2,34,54,66,79,105,210,333};

        int dest2 = 2;
        boolean flag2 = false;
        int head = 0;
        int end = arr3.length - 1;

        while(head <= end ){

            int middle = (head + end) / 2;

            if(dest2 == arr3[middle]){
                System.out.println("找到了，索引位置为：" + middle);
                flag2 = true;
                break;
            }else if(arr3[middle] > dest2 ){
               end = middle - 1;
            }else{ // arr3[middle] < dest2
               head = middle + 1;
            }

        }

        if(!flag2){
            System.out.println("很遗憾没找到！");
        }

    }
}
