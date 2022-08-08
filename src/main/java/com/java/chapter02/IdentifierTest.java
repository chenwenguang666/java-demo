package com.java.chapter02;

/**
 * TODO 标识符测试
 * Created by tom on 2022/8/2
 */
public class IdentifierTest {

    public static void main(String[] args) {

        // 1. 标识符命名规则
        /*  (1) 由26个英文字母大小写，0-9 ，_或 $ 组成
            (2) 数字不可以开头。
            (3) 不可以使用关键字和保留字，但能包含关键字和保留字。
            (4) Java中严格区分大小写，长度无限制。
            (5) 标识符不能包含空格。
        */

        // 2. 标识符命名规范
        /*  (1) 包名：多单词组成时所有字母都小写：xxxyyyzzz
            (2) 类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz
            (3) 变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz
            (4) 常量名：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ
        */

        int Aa0_$ = 10;

        // int 12ss= 10; error

        // int Aa 22 = 10; error
    }
}
