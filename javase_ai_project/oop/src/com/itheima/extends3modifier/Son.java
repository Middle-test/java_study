package com.itheima.extends3modifier;

import com.itheima.extends2modifier.Father;

//注意：java的类只支持单继承，不支持多继承，但支持多层继承
public class Son extends Father {
    public void show() {
//        privateMethod();//报错
//        method();//报错
        protectedMethod();
        publicMethod();
    }
}
