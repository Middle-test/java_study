package com.itheima.basic;

public class SwitchDemo {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    //switch穿透性的作用：相同的case语句可以放在一起
    public static void test1() {
        String day = "星期三";
        switch (day) {
            case "星期一":
            case "星期二":
            case "星期三":
            case "星期四":
            case "星期五":
                System.out.println("工作日");
                break;
            case "星期六":
                System.out.println("星期六");
                break;
            case "星期日":
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入有误");
                break;
        }

    }

    public static void test2() {
        double h1 = 8848860, h2 = 0.1, sum = 0;
        while (h1 > h2) {
            h2 *= 2;
            sum++;
        }
        System.out.println(sum);
    }
}
