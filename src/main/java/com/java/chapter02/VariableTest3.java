package com.java.chapter02;

/**
 * TODO 强制类型转换演示
 * Created by tom on 2022/8/2
 */
public class VariableTest3 {

    public static void main(String[] args) {


        // 使用强转符 ()
        double d1 = 12.9;

        // 损失精度1
        System.out.println((int)d1);

        long l1 = 123;
        // 没有损失精度
        System.out.println((int)l1);

        // 损失精度2
        int i1 = 128;

        System.out.println((byte)i1);

    }
}
