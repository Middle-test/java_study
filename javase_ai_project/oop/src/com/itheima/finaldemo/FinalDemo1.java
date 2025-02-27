package com.itheima.finaldemo;

public class FinalDemo1 {
    //final修饰静态成员变量
    //final修饰静态变量，这个变量被称为常量，可以记住一个固定值，并且在程序中不能修改了，通常这个值作为系统的配置信息
    //常量的名称建议全部大写，多个单词用下划线隔开
    public static final String SCHOOL_NAME = "黑马程序员";
    //final修饰实例变量(一般没有意义)
    private final String name = "张三";

    public static void main(String[] args) {
        //目标：认识final关键字的作用
        //3、final变量有且只能被赋值一次
        /*
            变量有哪些？
            1、成员变量：
                静态成员变量
                实例成员变量
            2、局部变量
         */
        final int age = 18;
//        age = 19; //报错

        buy(0.8);

        //final修饰引用类型的变量，地址值不能修改，但引用类型指向的对象的内容可以修改
        final int[] arr = new int[]{1, 2, 3};
//        arr = new int[]{1, 2, 3}; //报错
        arr[0] = 100;
    }

    public static void buy(final double z) {
//        z=0.1;  //报错
        System.out.println(z);
    }

}


//1、final类不能被继承
final class A {
}

//class B extends A{} //报错

//2、final方法不能被重写
class C {
    public final void run() {
        System.out.println("C类中的run方法");
    }
}

class D extends C {
    //    @Override
//    public void run() {
//        super.run();
//    }  // 报错
}