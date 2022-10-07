package com.java.chapter04.day16.java2;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

/**
 * TODO 异常体系简述
 * Created by tom on 2022/10/5
 */

/*
 * 一、异常体系结构
 *
 * java.lang.Throwable
 * 		|-----java.lang.Error:一般不编写针对性的代码进行处理。
 * 		|-----java.lang.Exception:可以进行异常的处理
 * 			|------编译时异常(checked)
 * 					|-----IOException
 * 						|-----FileNotFoundException
 * 					|-----ClassNotFoundException
 * 			|------运行时异常(unchecked,RuntimeException)
 * 					|-----NullPointerException
 * 					|-----ArrayIndexOutOfBoundsException
 * 					|-----ClassCastException
 * 					|-----NumberFormatException
 * 					|-----InputMismatchException
 * 					|-----ArithmeticException
 *
 * 面试题：常见的异常都有哪些？举例说明
 */

public class ExceptionTest {

    // 1.运行时异常
    @Test
    public void test1() {

        // NullPointerException
        String str = null;
        System.out.println(str.toString());


    }

    @Test
    public void test2() {

        // ArrayIndexOutOfBoundsException
        int[] arr = new int[10];
        System.out.println(arr[10]);

    }

    @Test
    public void test3(){

        // ClassCastException

        Object obj = new Date();
        String str = (String) obj;


    }

    @Test
    public void test4(){
        // NumberFormatException

        int i = Integer.parseInt("123a");
        System.out.println(i);
    }

    @Test
    public void test5(){
        // InputMismatchException

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println(number);

    }

    @Test
    public void test6(){

        // ArithmeticException

        int result = 12 / 0;
        System.out.println(result);

    }

    // 2.编译时异常

    @Test
    public void test7(){

//        File file = new File("hello.txt");

//        FileInputStream fis = new FileInputStream(file);

//        int data = fis.read();
//        while(data != -1){
//            System.out.print((char)data);
//            data = fis.read();
//        }
//        fis.close();

    }

}
