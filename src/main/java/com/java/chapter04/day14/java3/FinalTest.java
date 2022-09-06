package com.java.chapter04.day14.java3;

/**
 * TODO final关键字测试
 * Created by tom on 2022/9/5
 */

/*
 * final:最终的
 *
 * 1. final可以用来修饰的结构：类、方法、变量
 *
 * 2. final 用来修饰一个类:此类不能被其他类所继承。
 *          比如：String类、System类、StringBuffer类
 *
 * 3. final 用来修饰方法：表明此方法不可以被重写
 * 			比如：Object类中getClass();
 *
 * 4. final 用来修饰变量：此时的"变量"就称为是一个常量
 * 	    4.1 final修饰属性：可以考虑赋值的位置有：显式初始化、代码块中初始化、构造器中初始化
 * 		4.2 final修饰局部变量：
 *           尤其是使用final修饰形参时，表明此形参是一个常量。当我们调用此方法时，给常量形参赋一个实参。一旦赋值
 *           以后，就只能在方法体内使用此形参，但不能进行重新赋值。
 *
 *  static final 用来修饰属性：全局常量
 */

public class FinalTest {

    // 常量
    public final  int NUMBER = 1;
    // 全局常量
    public static final int NUM = 12;


    // 声明常量
    public final int NUMBER1;
    public final int NUMBER2;
    public final int NUMBER3;

    // 代码块中赋值
    {
        NUMBER1 = 1;
    }

    // 构造器中赋值
    public  FinalTest(){
        NUMBER2 = 2;
        NUMBER3 = 3;
    }

    public FinalTest(int n){
        NUMBER2 = 2;
        NUMBER3 = n;
    }

    public static void main(String[] args) {

        FinalTest test = new FinalTest();
        // 不能重新赋值
//        test.NUMBER = 2;

    }

}


final class A{

}

//class B extends A{
//
//}

class C{

    public final void method(){

    }
}

class D extends C{

    // 不能被重写
//    public void method(){
//
//    }

}
