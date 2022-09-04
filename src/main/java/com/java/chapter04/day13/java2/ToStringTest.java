package com.java.chapter04.day13.java2;


/**
 * TODO toString测试
 * Created by cwg on 2022/9/1
 */

/*
 * Object类中toString()的使用：
 *
 * 1. 当我们输出一个对象的引用时，实际上就是调用当前对象的toString()
 *
 * 2. Object类中toString()的定义：
 *   public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
     }
 *
 * 3. 像String、Date、File、包装类等都重写了Object类中的toString()方法。
 *    使得在调用对象的toString()时，返回"实体内容"信息
 *
 * 4. 自定义类也可以重写toString()方法，当调用此方法时，返回对象的"实体内容"
 */
public class ToStringTest {

    public static void main(String[] args) {

        // 自定义类
        Customer customer = new Customer("zhangsan", 18);
        System.out.println(customer); // com.java.chapter04.day13.java2.Customer@6d6f6e28  重写toString方法之后：Customer [name=zhangsan, age=18]
        System.out.println(customer.toString()); // com.java.chapter04.day13.java2.Customer@6d6f6e28  重写toString方法之后：Customer [name=zhangsan, age=18]

        //String
        String str1 = new String("aaa");
        System.out.println(str1); // aaa
        System.out.println(str1.toString());// aaa

    }

}
