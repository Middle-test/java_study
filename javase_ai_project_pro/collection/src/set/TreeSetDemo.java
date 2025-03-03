package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //目标：搞清楚TreeSet集合的底层原理，以及排序规则。
        Set<Teacher> ts = new TreeSet<>((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary()));
        ts.add(new Teacher("张三", 30, 5000));
        ts.add(new Teacher("李四", 28, 6000));
        ts.add(new Teacher("王五", 35, 4000));
        ts.add(new Teacher("赵六", 32, 7000));

        System.out.println(ts);

        //TreeSet集合默认不能给自定义对象排序，因为不知道大小规则
        //解决方案
        //1、对象类实现一个Comparable接口，重写compareTo方法，自定义排序规则
        //2、public TreeSet(Comparator c)集合自带比较器Comparator对象，指定比较规则

    }
}
