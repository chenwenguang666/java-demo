package com.java.chapter04.day10.java1;

import com.java.chapter04.day10.java.Order;

/**
 * TODO 修饰符权限大小测试
 * Created by cwg on 2022/8/24
 */
public class OrderTest {

    public static void main(String[] args) {

        Order order = new Order();

        // 出了Order类所属的包之后，私有的结构、缺省声明的结构就不可以调用了
        // order.orderDefault = 1;

        order.orderPublic = 2;

        // 出了Order类所属的包之后，私有的结构、缺省声明的结构就不可以调用了
        // order.methodDefault();

        order.methodPublic();
    }

}
