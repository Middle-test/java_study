package com.itheima.basic;

public class Demo3 {
    // 生成随机验证码
    public static void main(String[] args) {
        test1(6);
    }

    public static void test1(int length) {
        String code ="";
        for (int i = 0; i < length; i++) {
            int type = (int) (Math.random() * 3);
            switch (type) {
                case 0:
                    code += (char) ((int) (Math.random() * 26) + 65);
                    break;
                case 1:
                    code += (char) ((int) (Math.random() * 26) + 97);
                    break;
                case 2:
                    code += (int) (Math.random() * 10);
                    break;
                default:
                    System.out.println("出现错误");
            }
        }
        System.out.println(code);
    }
}

