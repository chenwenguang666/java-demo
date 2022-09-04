package com.java.chapter04.day12.java3;

/**
 * TODO 子类实例化的全过程
 * Created by cwg on 2022/8/29
 */

/*
1) 从结果上来看：（继承性）
		(1) 子类继承父类以后，就获取了父类中声明的属性或方法。创建子类的对象，在堆空间中，就会加载所有父类中声明的属性。

	2) 从过程上来看：
		(1)	当我们通过子类的构造器创建子类对象时，我们一定会直接或间接的调用其父类的构造器，进而调用父类的父类的构造器，...
		直到调用了java.lang.Object类中空参的构造器为止。
		正因为加载过所有的父类的结构，所以才可以看到内存中有父类中的结构，子类对象才可以考虑进行调用。
 */
public class Wolf extends Animal {
    public Wolf() {
        super("灰太狼", 3);
        System.out.println("Wolf无参数的构造器");
    }

    public static void main(String[] args) {
        new Wolf();
    }
}

class Creature {
    public Creature() {
        super();
        System.out.println("Creature无参数的构造器");
    }
}


class Animal extends Creature {
    public Animal(String name) {
        super();
        System.out.println("Animal带一个参数的构造器，该动物的name为" + name);
    }

    public Animal(String name, int age) {
        this(name);
        System.out.println("Animal带两个参数的构造器，其age为" + age);
    }
}

