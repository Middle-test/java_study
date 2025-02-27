package com.itheima.abstractdemo2;

public class Test {
    public static void main(String[] args) {
        //目标：理解抽象类的使用场景：模板方法设计模式
        //学生和老师都要写一篇作文：《我的爸爸》
        //第一段是一样的：我爸爸是一个好人，我喜欢他，他对我很好，我介绍一下他
        //第二段是不一样的，老师和学生各写各的
        //第三段是一样的：他很爱我，我爱他，他很棒，他很优秀
        //解决：抽出一个父类，父类中还抽出一个模板方法来给子类使用
        Teacher teacher = new Teacher();
        teacher.write();
        Student student = new Student();
        student.write();
    }
}
