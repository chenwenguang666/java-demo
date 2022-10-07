package com.java.chapter04.day16.java3;

/**
 * TODO
 * Created by tom on 2022/10/5
 */
public class StudentTest {

    public static void main(String[] args) {


        Student student = new Student();

        try {
            student.regist(-1001);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(student.getId());
    }

}


class Student {

    private int id;


    public void regist(int id) throws Exception {

            if(id > 0){
                this.id = id;
            }else{
//                throw new RuntimeException("你输入的数字非法!"); // 抛出运行时异常
//                throw new Exception("你输入的数字非法!"); // 抛出编译时异常
                throw new MyException("不能输入负数!"); // 抛出自定义异常
            }


    }

    public int getId() {
        return id;
    }


}
