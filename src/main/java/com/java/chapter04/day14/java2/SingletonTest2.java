package com.java.chapter04.day14.java2;

/**
 * TODO 懒汉式（不完整版，存在线程安全缺陷）
 * Created by cwg on 2022/9/1
 */
public class SingletonTest2 {



}

class Order{

    // 1.私有化构造器
    private Order(){

    }

    // 2.声明私有的静态的Order类型对象， 赋值为null
    private static Order instance = null;

    // 3.等到，需要使用到这个类的时候再创建对象
    public  static Order getInstance(){
        // 等待需要时再创建对象
        if(instance == null){
            instance = new Order();
        }

        return instance;
    }

}
