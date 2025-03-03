package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        //目标：掌握Stream流的统计，收集操作（终结方法）
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("张三", 30, 5000));
        teachers.add(new Teacher("李四", 28, 6000));
        teachers.add(new Teacher("王五", 35, 7000));
        teachers.add(new Teacher("赵六", 32, 8000));

        teachers.stream().filter(t -> t.getSalary() > 6000).forEach(System.out::println);
        System.out.println("-------------------------");

        System.out.println(teachers.stream().filter(t -> t.getSalary() > 6000).count());
        System.out.println("-------------------------");

        Optional<Teacher> max = teachers.stream().filter(t -> t.getSalary() > 6000).max((t1, t2) -> Double.compare(t1.getSalary(), t2.getSalary()));
        Teacher maxSalaryTeacher = max.get();//获取Optional对象中的值
        System.out.println(maxSalaryTeacher);
        System.out.println("-------------------------");

        //收集到集合或者数组中去
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //收集到list集合
        List<String> list_zhang = list.stream().filter(name -> name.contains("张")).collect(Collectors.toList());
        System.out.println(list_zhang);
        System.out.println("-------------------------");

        //收集到Set集合
        Set<String> set_zhang = list.stream().filter(name -> name.contains("张")).collect(Collectors.toSet());
        System.out.println(set_zhang);
        System.out.println("-------------------------");

        //收集到数组中
        Object[] arr = list.stream().filter(name -> name.contains("张")).toArray();
        for (Object o : arr) {
            System.out.println(o);
        }
        System.out.println("-------------------------");

        //收集到Map集合中
        Stream<Teacher> sorted = teachers.stream();
        Map<String, Double> map = sorted.collect(Collectors.toMap(Teacher::getName, Teacher::getSalary));
        System.out.println(map);

    }

}
