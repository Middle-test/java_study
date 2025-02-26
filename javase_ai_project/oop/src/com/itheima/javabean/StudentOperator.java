package com.itheima.javabean;

public class StudentOperator {
    //必须拿到学生对象
    private Student s;
    public StudentOperator(Student s){
        this.s = s;
    }
    //提供方法，打印学生对象的总成绩
    public void printTotalScore(){
        System.out.println(s.getName()+" 总成绩 "+(s.getChinese()+s.getMath()));
    }
    //提供方法，打印学生对象的平均成绩
    public void printAvgScore(){
        System.out.println((s.getName()+" 平均成绩 "+(s.getChinese()+s.getMath())/2));
    }
}
