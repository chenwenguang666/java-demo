package com.java.chapter08.day02.java;

/**
 * TODO 卖票   Thread例子 变成线程安全的
 * Created by tom on 2022/10/7
 */
public class WindowTest2 {

    public static void main(String[] args) {

        Window2 t1 = new Window2();
        Window2 t2 = new Window2();
        Window2 t3 = new Window2();

        t1.start();
        t2.start();
        t3.start();

    }

}


class Window2 extends Thread {

    private static int ticket = 100;
    private static Object obj = new Object();

    @Override
    public void run() {


        while (true) {

            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 同步代码块：
            // 同样的同步监视器可以使用任意对象，但是必须多个线程共用同一个同步监视器
            // 继承Thread类的线程，最好使用 类.class 这种同步监视器
//            synchronized (obj) {
            synchronized (Window2.class){
                if (ticket > 0) {
                    System.out.println(getName() + "卖票， 票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }


    }
}
