package com.itheima.demo1;

public class GoldCard extends Card {
    public GoldCard(String carId, String name, String phone, int money) {
        super(carId, name, phone, money);
    }

    //重写消费方法
    @Override
    public void pay(double money) {
        System.out.println("您当前余额：" + money);
        System.out.println("优惠后的价格：" + money * 0.8);
        if (getMoney() < money * 0.8) {
            System.out.println("您的余额不足，请充值");
            return;
        }
        //更新金卡余额
        setMoney(getMoney() - money * 0.8);
        //判断消费如果大于200，打印洗车票
        if (money * 0.8 >= 200) {
            printTicket();
        } else {
            System.out.println("您消费不足200，没有获得洗车票");
        }
    }

    public void printTicket() {
        System.out.println("恭喜您获得洗车票一张");
    }
}
