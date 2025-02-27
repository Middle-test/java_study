package com.itheima.enumdemo;

public class Test2 {
    public static void main(String[] args) {
        //目标：掌握枚举类的应用场景，做信息的分类和标志
        //需求：模拟上下左右移动图片
        //参数值受枚举类约束
        move(Direction.UP);
    }

    public static void move(Direction d) {
        switch (d) {
            case UP:
                System.out.println("向上移动");
                break;
            case DOWN:
                System.out.println("向下移动");
                break;
            case LEFT:
                System.out.println("向左移动");
                break;
            case RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
