package com.java.chapter08.day02.java;

/**
 * TODO 同步方法 Runnable例子
 * Created by tom on 2022/10/7
 */
public class WindowTest3 {

    public static void main(String[] args) {

        Window3 window3 = new Window3();

        Thread t1 = new Thread(window3);
        Thread t2 = new Thread(window3);
        Thread t3 = new Thread(window3);

        t1.start();
        t2.start();
        t3.start();

    }

}


class Window3 implements Runnable {

    private int ticket = 100;

    private Object obj = new Object();

    @Override
    public void run() {

        while (true) {

            show();

        }

    }

    public synchronized void show(){
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "卖票， 票号为" + ticket);
            ticket--;
        }
    }
}
