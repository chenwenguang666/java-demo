package com.java.chapter04.day16.java2;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

/**
 * TODO finally测试
 * Created by tom on 2022/10/5
 */

/*
 * try-catch-finally中finally的使用：
 *
 *
 * 1.finally是可选的
 *
 * 2.finally中声明的是一定会被执行的代码。即使catch中又出现异常了，try中有return语句，catch中有
 * return语句等情况。
 *
 * 3.像数据库连接、输入输出流、网络编程Socket等资源，JVM是不能自动的回收的，我们需要自己手动的进行资源的
 *   释放。此时的资源释放，就需要声明在finally中。
 *
 *
 *
 */
public class FinallyTest {


    // 关闭资源
    @Test
    public void test3() {

        FileInputStream fis = null;
        try {
            File file = new File("datas/hello.txt");
            fis = new FileInputStream(file);

            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }

    @Test
    public void test2() {
        int i = method();
        System.out.println(i);
    }

    public int method() {

        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return 2;
        } finally {
            System.out.println("我一定会被执行");
//            return 3;
        }


    }


    @Test
    public void test1() {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);


        } catch (Exception e) {
            e.printStackTrace();

            // catch中报异常
            int[] arr = new int[10];
            System.out.println(arr[10]);

        } finally {

            System.out.println("我一定会执行！！！~");

        }


    }

}
