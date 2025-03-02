package genericitydemo4;

import java.util.ArrayList;

public class GenericDemo6 {
    public static void main(String[] args) {
        //目标：搞清楚泛型和集合不支持基本数据类型，只能支持对象类型（引用类型）
//        ArrayList<int> list = new ArrayList<int>(); 报错
        //泛型擦除：泛型在运行期间会被擦除，变成Object类型

        //把基本数据类型变成包装类对象
        //手工包装：
//        Integer i = new Integer(10); 过时
        Integer i1 = Integer.valueOf(100);
        Integer i2 = Integer.valueOf(100);
        System.out.println(i1 == i2);

        //自动包装：
        Integer i3 = 120;
        Integer i4 = 120;
        System.out.println(i3 == i4);
        //注意：自动包装的范围是-128~127，共享一个常量池，超过会创建新的对象

        //自动拆箱
        int a = i3;
        System.out.println(a);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(123); //自动装箱，123变成Integer对象
        int rs = list.get(0);//自动拆箱，Integer对象变成int

        System.out.println("----------------------------------------------------");

        //包装类新增功能
        //1、把基本类型的数据转换为字符串
        int j = 23;
        String rs1 = Integer.toString(j); //"23"
        System.out.println(rs1 + 1); //231
        System.out.println("----------------------------------------------------");

        //2、把字符串数据转换为对应的基本数据类型（很有用）
        String str = "99";
//        int i = Integer.parseInt(str);
        int i = Integer.valueOf(str);
        System.out.println(i + 1);


    }
}
