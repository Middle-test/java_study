package com.itheima.lambda;

public class LambadaDemo1 {
    public static void main(String[] args) {
        //目标：认识lambda表达式
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("小猫喵喵喵");
            }
        };
        a.cry();
        //错误示范：lambda表达式不能简化所以匿名内部类，只能简化函数式接口的匿名内部类
//        Animal a1 =()-> {
//            System.out.println("小猫喵喵喵");
//        };
        System.out.println("================");

//        Swim s1 =new Swim() {
//            @Override
//            public void swimming() {
//                System.out.println("学生游泳贼快");
//            }
//        };
        Swim s1 = () -> System.out.println("学生游泳贼快");

        s1.swimming();

    }
}

abstract class Animal {
    public abstract void cry();
}

@FunctionalInterface//声明函数式接口的注解
// 函数式接口：只有一个抽象方法
interface Swim {
    void swimming();
}