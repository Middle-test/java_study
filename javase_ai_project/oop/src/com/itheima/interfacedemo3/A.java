package com.itheima.interfacedemo3;

public interface A {
    //1、默认方法(普通实例方法)：必须用default修饰
    //默认会用public修饰
    default void go() {
        System.out.println("go方法执行了");
        run();
    }

    //2、私有方法
    //私有的实例方法
    //只能在当前接口中调用
    private void run() {
        System.out.println("run方法执行了");
    }

    //3、静态方法
    //只能使用当前接口名调用
    static void eat() {
        System.out.println("eat方法执行了");
    }
}
