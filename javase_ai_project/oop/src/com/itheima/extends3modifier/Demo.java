package com.itheima.extends3modifier;

import com.itheima.extends2modifier.Father;

public class Demo {
    public static void main(String[] args) {

        Father father = new Father();
//        father.method();//报错
//        father.protectedMethod();//报错
//        father.privateMethod();//报错
        father.publicMethod();
    }
}
