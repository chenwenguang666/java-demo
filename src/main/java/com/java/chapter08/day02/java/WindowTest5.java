package com.java.chapter08.day02.java;

import java.util.concurrent.locks.ReentrantLock;

/**
 * TODO Lock锁的使用
 * Created by tom on 2022/10/7
 */
public class WindowTest5 {

    public static void main(String[] args) {

        Window5 window5 = new Window5();

        Thread t1 = new Thread(window5);
        Thread t2 = new Thread(window5);
        Thread t3 = new Thread(window5);

        t1.start();
        t2.start();
        t3.start();

    }

}


class Window5 implements Runnable {

    private int ticket = 100;
    private final ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {


        while (true) {

            try {
                lock.lock();

                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖票， 票号为" + ticket);
                    ticket--;
                }

            }finally {
                lock.unlock();
            }

        }

    }

}
