package com.java.chapter04.day16.java3;

/**
 * TODO 自定义异常类
 * Created by tom on 2022/10/5
 */


//public class MyException extends Exception{ // 编译时异常
public class MyException extends RuntimeException{ // 运行时异常


    static final long serialVersionUID = -7034897193246939L;


    public MyException(){

    }

    public MyException(String msg){
        super(msg);
    }


}
