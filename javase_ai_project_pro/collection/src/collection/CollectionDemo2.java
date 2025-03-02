package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {
    public static void main(String[] args) {
        //目标：掌握Collection的遍历方式一：迭代器遍历
        //解决并发修改异常需要使用迭代器本身的方法：it.remove()，其中自带i--操作
        Collection<String> names = new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("赵六");

        //1、得到这个集合的迭代器对象
        Iterator<String> it = names.iterator();
//        System.out.println(it.next());

        //2、使用一个while循环遍历
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }

    }
}
