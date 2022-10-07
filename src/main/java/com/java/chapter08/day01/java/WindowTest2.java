package com.java.chapter08.day01.java;

/**
 * TODO
 * Created by tom on 2022/10/6
 */

/**
 * 例子：创建三个窗口卖票，总票数为100张.使用实现Runnable接口的方式
 * 存在线程的安全问题，待解决。
 *
 */
public class WindowTest2 {

    public static void main(String[] args) {

        Window2 window2 = new Window2();

        Thread t1 = new Thread(window2);
        Thread t2 = new Thread(window2);
        Thread t3 = new Thread(window2);


        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }

}


class Window2 implements Runnable{

    private int ticket = 100;
    @Override
    public void run() {

        while(true){

            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket );
                ticket--;
            }else{
                break;
            }
        }

    }
}
