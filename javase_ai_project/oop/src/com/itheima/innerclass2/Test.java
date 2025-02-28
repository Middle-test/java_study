package com.itheima.innerclass2;

public class Test {
    public static void main(String[] args) {
        //目标：认识匿名内部类
        //匿名内部类实际上有名字：外部类名$编号.class
        //匿名内部类本质是一个子类，同时会立即构建一个子类对象
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("小猫喵喵叫");
            }
        };


//        a.cry();


        start(new Swim() {
            @Override
            public void swimming() {
                System.out.println("小猫在游泳");
            }
        });

    }

    public static void start(Swim s) {
        s.swimming();
    }
}

interface Swim {
    public void swimming();
}
//class Cat extends Animal{
//    @Override
//    public void cry() {
//        System.out.println("小猫喵喵叫");
//    }
//}