package com.itheima.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //目标：掌握arrayList集合的常用方法
        //创建arrayList集合对象
        ArrayList<String> list = new ArrayList<>();//泛型定义集合
        //添加数据
        list.add("hello");
        list.add("world");
        list.add("java");
//        list.add(123);
//        list.add(true);
        System.out.println(list);
        System.out.println("==========================");
        //查找数据
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println("==========================");
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("============按索引删除数据==============");
        //删除数据
        list.remove(0);
        System.out.println(list);
        System.out.println("============按元素删除数据==============");
        list.remove("java");
        System.out.println(list);
        System.out.println("============修改数据 ==============");
        //修改数据
        list.set(0, "final");
        System.out.println(list);
    }
}
