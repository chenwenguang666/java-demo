package com.java.chapter08.day02.java2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * TODO
 * Created by tom on 2022/10/7
 */
public class ThreadPool {

    public static void main(String[] args) {

        // 创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // 设置线程池属性
        ThreadPoolExecutor service = (ThreadPoolExecutor) executorService;
        service.setCorePoolSize(100);


        // 在线程池执行任务
        executorService.execute(new NumberThread());
//        executorService.submit()


        // 关闭线程池
        executorService.shutdown();

    }
}

class NumberThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}