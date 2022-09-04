package com.java.chapter04.day12.java3;

import com.java.chapter04.day12.java2.Order;

/**
 * TODO Order包的子类
 * Created by cwg on 2022/8/29
 */
public class SubOrder extends Order {

    public static void main(String[] args) {

        SubOrder subOrder = new SubOrder();

        subOrder.orderProtected = 1;
        subOrder.orderPublic = 2;

        subOrder.orderProtected();
        subOrder.orderPublic();

        // 根据权限修饰符的范围，此处不能使用
//        subOrder.orderDefault = 1;
//        subOrder.orderDefault();

    }
}
