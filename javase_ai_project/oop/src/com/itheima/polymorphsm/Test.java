package com.itheima.polymorphsm;

public class Test {
    public static void main(String[] args) {
        //认识多态
        //1、对象多态、行为多态
        Animal a1 = new Wolf();
        a1.run();//方法：编译看左边，运行看右边
        System.out.println(a1.name);//成员变量：编译看左边，运行也看左边
        Animal a2 = new Tortoise();
        a2.run();//方法：编译看左边，运行看右边
        System.out.println(a2.name);//成员变量：编译看左边，运行也看左边

        //2、多态的好处：右边是解耦合的，便于扩展和维护

        //3、多态的好处：使用父类类型的形参引用，可以指向不同的子类对象

        //4、多态的弊端：不能调用子类特有的成员变量和方法
//        a1.eat()//报错

        //强制类型转换,用instanceof判断，再强制类型转换
        if (a1 instanceof Wolf) {
            Wolf w1 = (Wolf) a1;
            w1.eat();
        } else if (a1 instanceof Tortoise) {
            Tortoise t1 = (Tortoise) a1;
            t1.eat();
        }
    }
}
