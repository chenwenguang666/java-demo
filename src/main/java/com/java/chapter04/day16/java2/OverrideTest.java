package com.java.chapter04.day16.java2;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * TODO
 * Created by tom on 2022/10/5
 */

/*
 * 方法重写的规则之一：
 * 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 *
 *
 */

public class OverrideTest {

}

class SuperClass {

    public void method() throws IOException {

    }


}

class SubClass extends SuperClass {
    // 肯定要小于父类抛出的类型， 父类都只能抛出这么多，子类怎么能抛出更多
    public void method() throws FileNotFoundException {

    }
}
