package reflectdemo;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        //反射的基本作用
        //1、类的全部成分的获取
        //2、可以破坏封装性
        //3、可以绕过泛型的约束(泛型的约束是在编译时限制的，而通过反射在运行时拿到类对象，拿到类方法，可以绕过泛型的限制)
        ArrayList<String> list = new ArrayList<>();
        list.add("张起灵");
        list.add("哈迪");
        list.add("刘练");

        Class c1 = list.getClass();//c1 = ArrayList.class
        Method add = c1.getDeclaredMethod("add", Object.class);//绕过泛型的限制获取add方法
        add.invoke(list, 12345);//翻墙
        add.invoke(list, true);//翻墙

        System.out.println(list);
    }



}
