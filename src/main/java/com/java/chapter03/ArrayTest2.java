package com.java.chapter03;

/**
 * TODO 数组的默认初始化值
 * Created by tom on 2022/8/11
 */
public class ArrayTest2 {
        /*
            数组元素的默认初始化值
            > 数组元素是整型：0
            > 数组元素是浮点型：0.0
            > 数组元素是char型：0或'\u0000'，而非'0'
            > 数组元素是boolean型：false
            > 数组元素是引用数据类型：null
        */

    public static void main(String[] args) {

        // 整型的默认值
        System.out.println("整型");
        System.out.println("=============== byte ===============");
        byte[] b1 = new byte[3];
        for(int i = 0;i < b1.length;i++){
            System.out.println(b1[i]);// 0
        }

        System.out.println("=============== int ===============");
        int[] i1 = new int[3];
        for(int i = 0;i < i1.length;i++){
            System.out.println(i1[i]);// 0
        }

        System.out.println("=============== long ===============");
        long[] l1 = new long[3];
        for(int i = 0;i < l1.length;i++){
            System.out.println(l1[i]);// 0
        }

        System.out.println("浮点型");
        System.out.println("=============== double ===============");
        double[] d1 = new double[3];
        for(int i = 0;i < d1.length;i++){
            System.out.println(d1[i]);// 0.0
        }

        System.out.println("char");
        System.out.println("=============== char ===============");
        char[] c1 = new char[3];
        for(int i = 0;i < c1.length;i++){
            System.out.println(c1[i]);// '\u0000'
        }

        if(c1[0] == '\u0000'){
            System.out.println("char == '\\u0000'");
        }

        System.out.println("boolean");
        System.out.println("=============== boolean ===============");
        boolean[] bool1 = new boolean[3];
        for(int i = 0;i < bool1.length;i++){
            System.out.println(bool1[i]);// false
        }

        System.out.println("引用数据类型");
        System.out.println("=============== String ===============");
        String[] strs = new String[3];
        for(int i = 0;i < strs.length;i++){
            System.out.println(strs[i]);// null
        }




    }


}
