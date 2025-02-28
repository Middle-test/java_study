package com.itheima.lambda.methodreference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Demo2 {
    //目标：理解构造器引用
    public static void main(String[] args) {
//        CarFactory cf = new CarFactory() {
//            @Override
//            public Car getCar(String name) {
//                return new Car(name);
//            }
//        };
//        CarFactory cf = name -> new Car(name);
        CarFactory cf = Car::new;
        Car c1 = cf.getCar("奔驰");
        System.out.println(c1);
    }
}

@FunctionalInterface
interface CarFactory {
    Car getCar(String name);
}


@Data
@AllArgsConstructor
@NoArgsConstructor
class Car {
    private String name;
}