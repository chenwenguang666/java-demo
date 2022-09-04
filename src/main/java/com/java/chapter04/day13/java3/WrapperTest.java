package com.java.chapter04.day13.java3;

import org.junit.Test;

/**
 * TODO 包装类测试
 * Created by cwg on 2022/9/1
 */

/*
 * 包装类的使用:
 * 1.java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
 *
 * 2.掌握的：基本数据类型、包装类、String三者之间的相互转换
 *
 * 3.包装类为引用数据类型
 *
 */
public class WrapperTest {

    // 基本数据类型 -> 包装类 ：
    // 如何转换：调用某个包装类的构造器即可。
    @Test
    public void test1() {

        // int -> Integer
        int num1 = 10;
        Integer integer1 = new Integer(num1);
        Integer integer2 = new Integer("123");
//        Integer integer3 = new Integer("123abc"); 报异常，不能乱入字符
        System.out.println(integer1.toString());
        System.out.println(integer2.toString());
//        System.out.println(integer3.toString());

        // float -> Float
        Float float1 = new Float(12.3f);
        Float float2 = new Float(12.3);
//        Float float3 = new Float("12.3aa");  报异常，不能乱入字符
        System.out.println(float1);
        System.out.println(float2);
//        System.out.println(float3);

        // boolean -> Boolean
        // true在转换成Boolean类型的时候，输入的字符不区分大小写。 只要判断最后是true即为true，其余为false。
        Boolean boolean1 = new Boolean(true);
        Boolean boolean2 = new Boolean("TrUe");
        Boolean boolean3 = new Boolean("TrUe123");
        System.out.println(boolean1);
        System.out.println(boolean2);
        System.out.println(boolean3);

        // 包装类为引用数据类型
        Order order = new Order();
        System.out.println(order.isMale); // false
        System.out.println(order.isFemale); // null
    }

    // 包装类 -> 基本数据类型
    // 如何转换：调用包装类Xxx的xxxValue()
    @Test
    public void test2() {

        Integer integer1 = new Integer(123);
        int num1 = integer1.intValue();
        System.out.println(num1);


        Boolean boolean1 = new Boolean(true);
        boolean bool = boolean1.booleanValue();
        System.out.println(bool);

    }

    // JDK 5.0 新特性：自动装箱 与自动拆箱
    // 自动装箱：自动将基本数据类型包装成包装类的实例
    // 自动拆箱：自动将包装类对象中包装的基本类型变量
    @Test
    public void test3() {

        // 自动装箱：基本数据类型 --->包装类
        int num1 = 10;
        Integer integer1 = num1;

        double d1 = 12.3;
        Double double1 = d1;

        // 自动拆箱：包装类--->基本数据类型
        int num2 = integer1;
        double d2 = double1;

    }

    // 基本数据类型、包装类--->String类型
    //  如何转换：调用String重载的valueOf(Xxx xxx)
    @Test
    public void test4() {
        int num1 = 10;
        // 方式一：
        String str1 = num1 + "";

        // 方式2：调用String的valueOf(Xxx xxx)
        String str2 = String.valueOf(num1);

        String str3 = String.valueOf(123.3);

        Double dou = new Double(12.3);
        String str4 = String.valueOf(dou);
        System.out.println(str4);
    }

    //String类型 --->基本数据类型、包装类：调用包装类的parseXxx(String s)
    @Test
    public void test5(){

        String str1 = "123";
        int i1 = Integer.parseInt(str1);
        System.out.println(i1);

        String str2 = "12.3";
        double d1 = Double.parseDouble(str2);
        System.out.println(d1);

        String str3 = "true1";
        boolean b1 = Boolean.parseBoolean(str3);
        System.out.println(b1);
    }

}

class Order {

    boolean isMale;
    Boolean isFemale;
}
