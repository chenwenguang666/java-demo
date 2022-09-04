package com.java.chapter04.day09.java1;

/**
 * TODO 引用数据类型值传递机制
 * Created by cwg on 2022/8/24
 */
public class ValueTransferTest3 {

    public static void main(String[] args) {

        Data data = new Data();

        data.m = 10;
        data.n = 20;

        System.out.println("data.m = " + data.m + ", data.n = " + data.n);

        swap(data);

        System.out.println("data.m = " + data.m + ", data.n = " + data.n);


    }

    public static void swap(Data data){

        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }

}

class Data{
    int m;
    int n;
}
