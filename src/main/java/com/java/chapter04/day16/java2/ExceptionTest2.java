package com.java.chapter04.day16.java2;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * TODO
 * Created by tom on 2022/10/5
 */

/*
 * 一、异常的处理：抓抛模型
 *
 * 过程一："抛"：程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象。
 *           并将此对象抛出。
 *           一旦抛出对象以后，其后的代码就不再执行。
 *
 * 		关于异常对象的产生：① 系统自动生成的异常对象
 * 					 ② 手动的生成一个异常对象，并抛出（throw）
 *
 * 过程二："抓"：可以理解为异常的处理方式：① try-catch-finally  ② throws
 *
 *
 * 二、try-catch-finally的使用
 *
 * try{
 * 		//可能出现异常的代码
 *
 * }catch(异常类型1 变量名1){
 * 		//处理异常的方式1
 * }catch(异常类型2 变量名2){
 * 		//处理异常的方式2
 * }catch(异常类型3 变量名3){
 * 		//处理异常的方式3
 * }
 * ....
 * finally{
 * 		//一定会执行的代码
 * }
 *
 * 说明：
 * 1. finally是可选的。
 * 2. 使用try将可能出现异常代码包装起来，在执行过程中，一旦出现异常，就会生成一个对应异常类的对象，根据此对象
 *    的类型，去catch中进行匹配
 * 3. 一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常的处理。一旦处理完成，就跳出当前的
 *    try-catch结构（在没有写finally的情况）。继续执行其后的代码
 * 4. catch中的异常类型如果没有子父类关系，则谁声明在上，谁声明在下无所谓。
 *    catch中的异常类型如果满足子父类关系，则要求子类一定声明在父类的上面。否则，报错
 * 5. 常用的异常对象处理的方式： ① String  getMessage()    ② printStackTrace()
 * 6. 在try结构中声明的变量，再出了try结构以后，就不能再被调用
 * 7. try-catch-finally结构可以嵌套
 *
 * 体会1：使用try-catch-finally处理编译时异常，是得程序在编译时就不再报错，但是运行时仍可能报错。
 *     相当于我们使用try-catch-finally将一个编译时可能出现的异常，延迟到运行时出现。
 *
 * 体会2：开发中，由于运行时异常比较常见，所以我们通常就不针对运行时异常编写try-catch-finally了。
 *      针对于编译时异常，我们说一定要考虑异常的处理。
 */
public class ExceptionTest2 {


    //
    @Test
    public void test1() {

        try {
            String str = "abc";
            int number = Integer.parseInt(str); // 转换异常

            System.out.println("Hello1!!!!"); // 异常以后的代码就不执行了
        }/*catch (Exception e){ 父类的异常
            e.printStackTrace();
        }*/ catch (NumberFormatException e) {
            // 打印错误信息
//            System.out.println(e.getMessage());

            // 打印全部报错信息
            e.printStackTrace();
        }

        // 异常之外的代码， 异常如果被处理了， 程序继续往下执行
        System.out.println("Hello2!!!");

    }


    @Test
    public void test2() {

        FileInputStream fis = null;

        try {
            File file = new File("datas/hello.txt");
            fis = new FileInputStream(file);

            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (fis != null)
                    fis.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


}



















