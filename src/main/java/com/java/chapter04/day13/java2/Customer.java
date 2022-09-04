package com.java.chapter04.day13.java2;

import java.util.Objects;

/**
 * TODO
 * Created by cwg on 2022/8/29
 */
public class Customer {

    private String name;
    private int age;


    public Customer() {
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    // 手动重写equals方法
//    @Override
//    public boolean equals(Object obj) {
//
//        // 两个地址相等，则为相等
//        if (this == obj) {
//            return true;
//        }
//
//        // 如果obj是Customer的实例，则向下转型
//        if (obj instanceof Customer) {
//            Customer customer = (Customer) obj;
//
//            return this.name.equals(customer.name) && this.age == customer.age;
//        }
//
//        return false;
//    }

    // 自动生成equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && name.equals(customer.name);
    }

    // 手动重写toString方法
//    @Override
//    public String toString() {
//        return "Customer [name=" + name + ", age=" + age + "]";
//    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
