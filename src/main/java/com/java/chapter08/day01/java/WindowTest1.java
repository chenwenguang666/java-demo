package com.java.chapter08.day01.java;

/**
 * TODO 多窗口卖票
 * Created by tom on 2022/10/6
 */

/**
 * 例子：创建三个窗口卖票，总票数为100张.使用继承Thread类的方式
 *
 * 存在线程的安全问题，待解决。
 */

public class WindowTest1 {

    public static void main(String[] args) {

        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }


}

class Window extends Thread {

    private static int ticket = 100;


    @Override
    public void run() {

        while (true) {
            if (ticket > 0) {
                System.out.println(getName() + "卖出一张票，票号为" + ticket);
                ticket--;
            } else {
                break;
            }
        }


    }
}
