package com.itheima.interfacedemo;

public class Test {
    public static void main(String[] args) {
        //目标：认识接口
        System.out.println(A.SCHOOL_NAME + "\n");
        //注意：接口不能创建对象
        //接口是用来被类实现的
        C c = new C();
        c.run();
        c.play();
        System.out.println(c.go());
    }
}

//实现类实现多个接口，必须重写完接口中所有的抽象方法，否则这个类必须定义为抽象类
class C implements A, B {

    @Override
    public void run() {
        System.out.println("C类重写了run方法");
    }

    @Override
    public String go() {
        return "go!go!go!";
    }

    @Override
    public void play() {
        System.out.println("C类重写了play方法");
    }
}
