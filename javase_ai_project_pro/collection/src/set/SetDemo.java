package set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        //目标：认识Set家族集合的特点
        //1、创建一个Set集合
//        Set<String> set = new HashSet<>();//特点：无序、不可重复、无索引
        Set<String> set = new LinkedHashSet<>();//特点：有序、不可重复、无索引
        set.add("java");
        set.add("java");
        set.add("C++");
        set.add("python");
        System.out.println(set);

        //2、创建一个TreeSet集合：排序(默认升序排序)，无重复，无索引
        Set<Double> set1 = new TreeSet<>();
        set1.add(3.14);
        set1.add(5.6);
        set1.add(1.2);
        set1.add(3.14);
        set1.add(1.0);
        System.out.println(set1);

    }
}
