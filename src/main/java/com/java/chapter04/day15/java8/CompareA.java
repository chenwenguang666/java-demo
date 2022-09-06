package com.java.chapter04.day15.java8;

/**
 * TODO 接口JDK8新特性
 * Created by tom on 2022/9/6
 */
interface CompareA {

    // 静态方法
    public static void method1() {
        System.out.println("静态方法！");
    }

    // 默认方法
    public default void method2() {
        System.out.println("CompareA：method2");
    }

    default void method3(){
        System.out.println("CompareA：method3");
    }

}
