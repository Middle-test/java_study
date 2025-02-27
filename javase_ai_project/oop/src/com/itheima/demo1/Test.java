package com.itheima.demo1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //目标：做一个加油站支付小程序
        // 创建一张金卡
        GoldCard goldCard = new GoldCard("888", "小明", "12345", 5000);

        // 创建一张银卡
        SilveryCard silveryCard = new SilveryCard("999", "小红", "67890", 2000);

        // 对金卡持有者进行支付处理
        pay(goldCard);

        // 对银卡持有者进行支付处理
        pay(silveryCard);
    }


    /**
     * 执行支付操作
     * 此方法负责从用户处获取消费金额，并使用提供的卡进行支付
     *
     * @param c Card类型的对象，代表用于支付的卡
     */
    public static void pay(Card c) {
        // 提示用户输入消费金额
        System.out.println("请输入消费金额：");

        // 创建Scanner对象以从控制台获取用户输入
        Scanner sc = new Scanner(System.in);

        // 获取用户输入的消费金额
        double money = sc.nextDouble();

        // 使用提供的卡执行支付操作
        c.pay(money);
    }
}

