package com.itheima.demo2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //目标：面向对象编程实现智能家居控制系统
        //角色：设备（吊灯、电视机、洗衣机、空调...）
        //具备的功能：开关
        //谁控制它们：智能控制系统（单例对象），控制调用设备的开关
        //1、定义设备类，创建设备对象代表家里的设备
        //2、准备这些设备对象，放到数组中
        JD[] jds = new JD[4];
        jds[0] = new TV("小米电视机", true);
        jds[1] = new WashMachine("海尔洗衣机", false);
        jds[2] = new Air("格力空调", false);
        jds[3] = new Lamp("欧灯", true);

        //3、定义一个接口，为每个设备指定一个开关控制功能
        //4、定义一个智能控制系统，控制这些设备开关
        SmartHomeControl smartHomeControl = SmartHomeControl.getInstance();
        //5、控制电视机
        smartHomeControl.control(jds[0]);
        //6、提示用户操作：展示所有设备的状态，让用户选择设备操作
        //打印所有设备状态
        while (true) {
            smartHomeControl.printAllStatus(jds);
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入设备编号：1.电视机 2.洗衣机 3.空调 4.灯");
            String command = sc.next();
            switch (command) {
                case "1":
                    smartHomeControl.control(jds[0]);
                    break;
                case "2":
                    smartHomeControl.control(jds[1]);
                    break;
                case "3":
                    smartHomeControl.control(jds[2]);
                    break;
                case "4":
                    smartHomeControl.control(jds[3]);
                    break;
                case "exit":
                    System.out.println("退出系统");
                    return;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        }
    }
}
