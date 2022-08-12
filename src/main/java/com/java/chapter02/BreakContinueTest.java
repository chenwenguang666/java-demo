package com.java.chapter02;

/**
 * TODO break、continue测试
 * Created by tom on 2022/8/8
 */
public class BreakContinueTest {

    public static void main(String[] args) {

        // break 、continue
        for(int i = 1;i <= 10;i++){

            if(i % 5 == 0){

                // break;
                continue;
                // System.out.println("1213123"); error 之后不能声明语句

            }

            System.out.print(i);
            //break：1234
            //continue：12346789
        }


        System.out.println("\n");
        //******************************

        label:for(int i = 1;i <= 4;i++){

            for(int j = 1;j <= 10;j++){

                if(j % 4 == 0){
                    //break;//默认跳出包裹此关键字最近的一层循环。
                    //continue;

                    break label;//结束指定标识的一层循环结构
                    //continue label;//结束指定标识的一层循环结构当次循环
                }

                System.out.print(j);
            }

            System.out.println();
        }




    }

}
