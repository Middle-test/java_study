package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo {
    public static void main(String[] args) {
        //目标：搞清楚Collection集合的特点
        //1、List家族的集合：有序、可重复、有索引
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("C++");
        System.out.println(list);

        //2、Set家族的集合：无序、不可重复、无索引
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("java");
        set.add("C++");
        set.add("pythonm ");
        System.out.println(set);
    }
}
