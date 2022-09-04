package com.java.chapter04.day09.java;



/**
 * TODO 自定义数组工具类测试
 * Created by cwg on 2022/8/23
 */
public class ArrayUtilTest {

    public static void main(String[] args) {

        ArraysUtil util = new ArraysUtil();
        int[] arr = new int[]{32,34,32,5,3,54,654,-98,0,-53,5};

        // 最大值
        System.out.println(util.getMax(arr));

        // 最小值
        System.out.println(util.getMin(arr));

    }

}
