package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        //目标：掌握HashSet集合去重操作
        Student s1 = new Student("小明", '男', 18, "北京");
        Student s2 = new Student("小红", '女', 17, "上海");
        Student s3 = new Student("小明", '男', 18, "北京");
        Student s4 = new Student("小红", '女', 17, "上海");

        //需要重写Set的equals和hashCode方法
        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println(set);
    }
}
