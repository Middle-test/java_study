package com.itheima.code;

import java.util.Arrays;

public class CodeDemo2 {
    private String name;
    private String[] direction = new String[4];

    //实例代码快：无static修饰，属于对象，每次创建对象是都会执行一次
    //基本作用，初始化对象的实力资源
    {
        System.out.println("实例代码快");
        name = "张三";
        direction[0] = "东";
        direction[1] = "南";
        direction[2] = "西";
        direction[3] = "北";
    }

    public static void main(String[] args) {
        new CodeDemo2();
        CodeDemo2 c = new CodeDemo2();
        System.out.println(Arrays.toString(c.direction));
    }
}
