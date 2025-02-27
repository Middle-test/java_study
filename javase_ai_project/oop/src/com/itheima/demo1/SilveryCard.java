package com.itheima.demo1;

public class SilveryCard extends Card {

    public SilveryCard(String carId, String name, String phone, int money) {
        super(carId, name, phone, money);
    }

    @Override
    public void pay(double money) {
        System.out.println("您当前余额：" + money);
        System.out.println("优惠后的价格：" + money * 0.9);
        if (getMoney() < money * 0.9) {
            System.out.println("您的余额不足，请充值");
            return;
        }
        //更新金卡余额
        setMoney(getMoney() - money * 0.9);
    }
}
