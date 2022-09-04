package com.java.chapter04.day10.java1;

/**
 * TODO JavaBean
 * Created by cwg on 2022/8/24
 */

/*
 * JavaBean是一种Java语言写成的可重用组件。

	所谓JavaBean，是指符合如下标准的Java类：
		>类是公共的
		>有一个无参的公共的构造器
		>有属性，且有对应的get、set方法

 *
 */

public class Customer {

    private String name;
    private int age;

    public Customer(){

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }




}
