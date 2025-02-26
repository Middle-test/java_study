package com.itheima;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        //目标：理解动态数组的定义和初始化
        test1();
    }
    public static void test1() {
        Scanner sc=new Scanner(System.in);
        double scores[]=new double[8];//动态初始化数组，只开辟空间
        for(int i=0;i<scores.length;i++){
            System.out.print("请输入第"+(i+1)+"个学生的成绩：");
            scores[i]=sc.nextDouble();
        }
        double allscores=scores[0];
        double maxscore=scores[0];
        double minscore=scores[0];
        for(int i=1;i<scores.length;i++){
            allscores+=scores[i];
            if(maxscore<scores[i]){
                maxscore=scores[i];
            }
            if(minscore>scores[i]){
                minscore=scores[i];
            }
        }
        System.out.println("平均成绩为："+(allscores/scores.length));
        System.out.println("最高成绩为："+maxscore);
        System.out.println("最低成绩为："+minscore);
    }
}
