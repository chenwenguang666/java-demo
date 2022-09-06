package com.java.chapter04.day15.java2;

/**
 * TODO 代理模式
 * Created by tom on 2022/9/6
 */
public class NetWorkTest {

    public static void main(String[] args) {
        new ProxyServer(new Server()).browse();
    }
}

// 接口
interface NetWork {

    public abstract void browse();

}

// 被代理类
class Server implements NetWork {


    @Override
    public void browse() {
        System.out.println("真实的服务器访问网站");
    }
}

// 代理类
class ProxyServer implements NetWork {

    private NetWork work;

    public ProxyServer(NetWork work) {
        this.work = work;
    }

    public void check() {
        System.out.println("联网之前的检查工作");
    }

    @Override
    public void browse() {
        check();

        work.browse();
    }
}



