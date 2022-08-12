package com.java.chapter02;

/**
 * TODO switch-case测试
 * Created by tom on 2022/8/8
 */
public class SwitchCaseTest2 {

    public static void main(String[] args) {

       /*
        例题：对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。

        说明：
          如果switch-case结构中的多个case的执行语句相同，则可以考虑进行合并。
          break在switch-case中是可选的
    */

        int score = 28;


        switch (score / 10) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;

            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
                break;
            default:
                System.out.println("输入有误！");
                break;
        }

    }
}
