package com.java.chapter02;

/**
 * TODO 变量声明测试
 * Created by tom on 2022/8/2
 */
public class VariableTest {

    /*
    1) Java中每个变量必须先声明，后使用
       (1) 成员变量：声明后就能使用，因为有默认值
       (2) 局部变量：声明后需要先初始化，才能使用（因为没有默认值）

    2) 使用变量名来访问这块区域的数据
	3) 变量的作用域：其定义所在的一对{ }内
    4) '变量只有在其作用域内才有效'
    5) '同一个作用域内，不能定义重名的变量'
    */

    public static void main(String[] args){

        // 局部变量变量声明
        int i;

        // 局部变量初始化
        i = 10;
        // 使用
        System.out.println(i);


        // 不能声明重名的变量
        // String i = "111"; Variable 'i' is already defined in the scope
    }

    public void test(){
        // i不在作用域内
        // System.out.println(i);
    }
}
