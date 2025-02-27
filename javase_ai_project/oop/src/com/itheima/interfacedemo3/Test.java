package com.itheima.interfacedemo3;

public class Test {
    public static void main(String[] args) {
        //目标：理解接口新增的三种方法
        AImpl a = new AImpl();
        a.go();
        A.eat();
    }
}

class AImpl implements A {

}