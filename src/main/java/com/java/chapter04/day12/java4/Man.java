package com.java.chapter04.day12.java4;

/**
 * TODO
 * Created by cwg on 2022/8/29
 */
public class Man extends Person {

    boolean isSmoking;

    int id = 1002;

    public void earnMoney(){
        System.out.println("男人负责挣钱养家");
    }

    public void eat(){
        System.out.println("男人吃肉");
    }

    public void walk(){
        System.out.println("男人走路");
    }
}
