package com.java.chapter04.day10.java;

/**
 * TODO 修饰符权限大小测试
 * Created by cwg on 2022/8/24
 */
public class OrderTest {

    public static void main(String[] args) {


        Order order = new Order();

        // 出了Order类之后，私有的结构就不可以调用了
        // order.orderPrivate = 1;

        order.orderDefault = 2;
        order.orderPublic = 3;

        //出了Order类之后，私有的结构就不可以调用了
        // order.methodPrivate();

        order.methodDefault();
        order.methodPublic();

    }
}
