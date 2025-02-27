package com.itheima.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok可以实现为类自动添加getter和setter方法，无参数的构造方法，toString方法等
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String carId;
    private String name;
    private String phone;
    private double money;

    //预存金额
    public void preStore(double money) {
        this.money += money;
    }

    //消费金额
    public void pay(double money) {
        this.money -= money;
    }


}

