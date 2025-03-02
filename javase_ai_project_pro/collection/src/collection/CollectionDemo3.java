package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo3 {
    public static void main(String[] args) {
        //目标：掌握Collection的遍历方式二、三：增强for循环、lambda表达式
        //注意，这两种方式无法解决并发修改异常,只适合做遍历
        Collection<String> names = new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("赵六");
//        test1(names);
        test2(names);
    }


    public static void test1(Collection<String> names) {
        //1、使用增强for循环遍历
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void test2(Collection<String> names) {
        //2、使用lambda表达式遍历
//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        names.forEach(s -> System.out.println(s));

        names.forEach(System.out::println);
    }

}
