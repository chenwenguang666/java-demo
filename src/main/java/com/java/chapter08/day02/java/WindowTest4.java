package com.java.chapter08.day02.java;

/**
 * TODO 同步方法 Thread例子
 * Created by tom on 2022/10/7
 */
public class WindowTest4 {

    public static void main(String[] args) {

        Window4 t1 = new Window4();
        Window4 t2 = new Window4();
        Window4 t3 = new Window4();

        t1.start();
        t2.start();
        t3.start();

    }

}


class Window4 extends Thread {

    private static int ticket = 100;

    @Override
    public void run() {


        while (true) {


                show();

        }
    }

    public static synchronized void show(){
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "卖票， 票号为" + ticket);
            ticket--;
        }
    }
}
