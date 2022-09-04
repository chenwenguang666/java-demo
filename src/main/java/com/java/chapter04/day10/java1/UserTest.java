package com.java.chapter04.day10.java1;

/**
 * TODO 属性赋值的先后顺序
 * Created by cwg on 2022/8/24
 */

/*
 * 总结：属性赋值的先后顺序
 *
 *
 * ① 默认初始化
 * ② 显式初始化
 * ③ 构造器中初始化
 *
 * ④ 通过"对象.方法" 或 "对象.属性"的方式，赋值
 *
 * 以上操作的先后顺序：① - ② - ③ - ④
 *
 */
public class UserTest {

    public static void main(String[] args) {


        User user = new User(18);

        user.setAge(22);

        System.out.println("name = " + user.name + ", age = " + user.age);
    }
}

class User {

    String name;
    int age = 1;

    public  User(int age) {
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
    }


}