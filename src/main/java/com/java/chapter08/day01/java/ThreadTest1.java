package com.java.chapter08.day01.java;

/**
 * TODO 线程创建方式一：继承Thread类
 * Created by tom on 2022/10/6
 */

/**
 * 多线程的创建，方式一：继承于Thread类
 * 1. 创建一个继承于Thread类的子类
 * 2. 重写Thread类的run() --> 将此线程执行的操作声明在run()中
 * 3. 创建Thread类的子类的对象
 * 4. 通过此对象调用start()
 *
 * 例子：遍历100以内的所有的偶数
 */
public class ThreadTest1 {

    public static void main(String[] args) {

        // 创建Thread子类的对象
        MyThread t1 = new MyThread();

        // 子类对象调用start()启动线程
        t1.start();

        //问题一：我们不能通过直接调用run()的方式启动线程。
        // 这样是没有启动线程的，只是通过对象调用run方法而已
        t1.run();


        // main线程
        for (int i = 0; i <= 100; i++) {

            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }

        //问题二：再启动一个线程，遍历100以内的偶数。不可以还让已经start()的线程去执行。会报IllegalThreadStateException
        // t1再次调用start()会出现java.lang.IllegalThreadStateException
        // 启动了就不能又再调用start()，再启动一遍，会报异常
        // t1.start();


    }


}

// 继承Tread类
class MyThread extends Thread {

    // 重写run方法


    @Override
    public void run() {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {

                // Thread.currentThread() ：获取当前线程对象
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }

    }
}
