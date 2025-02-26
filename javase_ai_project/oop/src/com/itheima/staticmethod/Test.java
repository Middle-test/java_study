package com.itheima.staticmethod;

public class Test {
    public static void main(String[] args) {
        //静态方法，开发一个验证码程序
        String code = VerifyCodeUtil.getCode(4);
        System.out.println(code);
    }
}
