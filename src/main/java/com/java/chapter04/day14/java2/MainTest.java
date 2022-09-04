package com.java.chapter04.day14.java2;

/**
 * TODO main方法总结
 * Created by cwg on 2022/9/1
 */

/*
 * main()方法的使用说明：
 * 1. main()方法作为程序的入口
 * 2. main()方法也是一个普通的静态方法
 * 3. main()方法可以作为我们与控制台交互的方式。（之前：使用Scanner）
 */

public class MainTest {

    public static void main(String[] args) {

        // main()方法也是一个普通的静态方法
        Main.main(new String[1]);

        for(int i = 0;i < args.length;i++){

            System.out.println(args[i]);

        }

    }
}


class Main{
    public static void main(String[] args) {

        System.out.println("我是Main中的main方法");

    }
}
