package com.itheima.lambda.methodreference;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        //目标：认识特定方法引用
        //特定方法简化lambda表达式
        String[] names = {"Tom", "Jerry", "Mike", "Jack", "Andy", "angle"};
        //要求：按照首字母的大小排序，忽略大小写
        //java中内置的忽略大小写比较的方法: compareToIgnoreCase
//        Arrays.sort(names,  (o1,o2) -> o1.compareToIgnoreCase(o2));
        //特定方法简化：类型：名称
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
