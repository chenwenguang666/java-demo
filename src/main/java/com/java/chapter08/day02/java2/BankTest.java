package com.java.chapter08.day02.java2;

/**
 * TODO
 * Created by tom on 2022/10/7
 */
public class BankTest {

    public static void main(String[] args) {

        Bank bank = Bank.newInstance();

    }

}


class Bank {

    //
    private static Bank instance = null;

    // 私有化构造器
    private Bank() {

    }

    public static Bank newInstance() {

        if(instance == null){
            // 优化再判断一次instance是否为null,不进入同步代码
            synchronized (Bank.class) {
                // 等到需要这个实例才创建对象
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }

        return instance;
    }


}
