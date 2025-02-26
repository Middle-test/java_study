package com.itheima.staticmethod;

public class VerifyCodeUtil {
    //工具类没有创建对象的必要性，所以把构造器私有化
    private VerifyCodeUtil(){}

    //静态方法定义工具类
    public static String getCode(int length) {
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
        return code;
    }
}
