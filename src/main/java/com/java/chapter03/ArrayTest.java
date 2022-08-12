package com.java.chapter03;

/**
 * TODO 一维数组测试
 * Created by tom on 2022/8/8
 */
public class ArrayTest {


    public static void main(String[] args) {
    /*
        5. 一维数组的使用
          ① 一维数组的声明和初始化
          ② 如何调用数组的指定位置的元素
          ③ 如何获取数组的长度
          ④ 如何遍历数组
          ⑤ 数组元素的默认初始化值 ：见ArrayTest1.java
          ⑥ 数组的内存解析 ：见ArrayTest1.java
     */


        // 1.一维数组的声明和初始化
        // 声明
        int[] ids;
        // 1.1 静态初始化
        ids = new int[]{1, 2, 3, 4, 5};

        // 1.2 动态初始化
        String[] names = new String[3];

        //错误的写法：
        // int[] arr1 = new int[];
        // int[5] arr2 = new int[5];
        // int[] arr3 = new int[3]{1,2,3};

        // 1.3 静态初始化：类型推断
        int[] arr4 = {1,3,5};
        //总结：数组一旦初始化完成，其长度就确定了。 长度就不可改变


        // 2.如何调用数组的指定位置的元素:通过角标的方式调用。
        // 数组的角标（或索引）从0开始的，到数组的长度-1结束。
        names[0] = "张三";
        names[1] = "李四";
        names[2] = "王五";
        // names[3] = "赵六"; 下标越界

        //3.如何获取数组的长度。
        // length属性
        System.out.println(names.length);
        System.out.println(arr4.length);


        // 4.如何遍历数组
        // 循环

        for(int i = 0;i < names.length;i++){
            System.out.println(names[i]);
        }



    }
}
