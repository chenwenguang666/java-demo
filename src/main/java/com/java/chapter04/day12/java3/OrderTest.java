package com.java.chapter04.day12.java3;

import com.java.chapter04.day12.java2.Order;

/**
 * TODO
 * Created by cwg on 2022/8/29
 */
public class OrderTest {

    public static void main(String[] args) {
        Order order = new Order();


        order.orderPublic = 1;
        order.orderPublic();

        // 根据权限修饰符的范围，此处不能使用
//        order.orderProtected = 1;
//        order.orderProtected();

    }

}
