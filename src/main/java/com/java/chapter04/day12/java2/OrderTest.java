package com.java.chapter04.day12.java2;

/**
 * TODO 测试4中权限修饰符范围
 * Created by cwg on 2022/8/29
 */
public class OrderTest {

    public static void main(String[] args) {
        Order order = new Order();

        // 根据权限修饰符的范围，此处不能使用
//        order.orderPrivate = 1;
//        order.orderPrivate();

        order.orderDefault = 1;
        order.orderProtected = 2;
        order.orderPublic = 3;

        order.orderDefault();
        order.orderProtected();
        order.orderPublic();

    }

}
