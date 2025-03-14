package com.itheima.abstractdemo2;

public abstract class People {
    //模板方法设计模式
    public final void write() {
        System.out.println("\t\t\t《我的爸爸》");
        System.out.println("\t我爸爸是一个好人，我喜欢他，他对我很好，我介绍一下他");
        //每个子类都要写这个方法，但是不同子类的方法不同
        writeMain();
        System.out.println("\t他很爱我，我爱他，他很棒，他很优秀");
    }

    public abstract void writeMain();
}
