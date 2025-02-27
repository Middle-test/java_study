package com.itheima.polymorphsm;

public class Tortoise extends Animal {
    String name = "乌龟";

    @Override
    public void run() {
        System.out.println("-------🐢乌龟跑的慢-------");
    }

    public void eat() {
        System.out.println("乌龟吃虫子");
    }
}
