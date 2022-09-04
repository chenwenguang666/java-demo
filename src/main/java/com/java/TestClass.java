package com.java;

/**
 * TODO 测试类
 * Created by tom on 2022/8/8
 */
public class TestClass {


    public static void main(String[] args) {


        String s1 = "hello";

        TestClass test = new TestClass();
        test.change(s1);

        System.out.println(s1);//hi~~

    }

    public void change(String s) {
        s = "hi~~";
    }

}
