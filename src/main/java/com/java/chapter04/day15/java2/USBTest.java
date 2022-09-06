package com.java.chapter04.day15.java2;

/**
 * TODO 接口的使用
 * Created by tom on 2022/9/6
 */

/*
 * 接口的使用
 * 1.接口使用上也满足多态性
 * 2.接口，实际上就是定义了一种规范
 * 3.开发中，体会面向接口编程！
 *
 */

public class USBTest {


    public static void main(String[] args) {

        Computer computer = new Computer();

        // 1.创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        computer.transferData(flash);

        // 2.创建了接口的匿名实现类的非匿名对象
        USB printer = new USB() {

            @Override
            public void start() {
                System.out.println("打印机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("打印机停止工作");
            }
        };

        computer.transferData(printer);

        // 3.创建了接口的匿名实现类的匿名对象

        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机停止工作");
            }
        });


    }
}

class Computer {

    public void transferData(USB usb) {

        usb.start();

        System.out.println("具体传输数据的细节");


        usb.stop();

    }

}


interface USB {


    void start();

    void stop();
}

class Flash implements USB {


    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("u盘停止工作");
    }
}


class Printer implements USB {

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作");
    }
}
