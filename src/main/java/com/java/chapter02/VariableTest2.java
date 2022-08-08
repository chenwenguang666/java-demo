package com.java.chapter02;

/**
 * TODO 自动类型提升演示
 * Created by tom on 2022/8/2
 */
public class VariableTest2 {


    public static void main(String[] args){

        // 1.自动类型提升
        // 结论：当容量小的数据类型的变量与容量大的数据类型的变量做运算时，结果自动提升为容量大的数据类型。
        // byte 、char 、short --> int --> long --> float --> double

        // 特别的：当byte、char、short三种类型的变量做运算时，结果为int型

        byte b1 = 10;
        char c1 = 10;
        short s1 = 10;

        // char c2 = b1 + c1 + s1; error
        // byte b2 = b1 + c1 + s1; error
        // short s2 = b1 + c1 + s1; error
        // 三者相互 或者 两两 或者跟自身 运算结果为int类型
        int i1 = b1 + c1 + s1;

        float f1 = 12.3f;

        double d1 = f1;

    }
}
