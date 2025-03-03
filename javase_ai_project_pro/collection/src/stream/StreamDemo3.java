package stream;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        //目标：掌握Stream流提供的常用的中间方法，对流上的数据进行处理（返回新流：支持链式编程）
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //1、过滤方法
        list.stream().filter(name -> name.contains("张")).filter(s -> s.length() == 3).forEach(System.out::println);
        System.out.println("-----------------------");

        //2、排序方法
        List<Double> score = new ArrayList<>();
        score.add(99.9);
        score.add(66.6);
        score.add(66.6);
        score.add(55.5);
        score.add(88.8);
        score.add(77.7);

        score.stream().sorted().forEach(System.out::println);//默认升序
        System.out.println("-----------------------");
        score.stream().sorted((s1, s2) -> Double.compare(s2, s1)).forEach(System.out::println);//自己定义降序
        System.out.println("-----------------------");
        score.stream().sorted((s1, s2) -> Double.compare(s2, s1)).limit(2).forEach(System.out::println);//降序取前两个
        System.out.println("-----------------------");
        score.stream().sorted((s1, s2) -> Double.compare(s2, s1)).skip(2).forEach(System.out::println);//降序跳过前两个
        System.out.println("-----------------------");
        score.stream().sorted((s1, s2) -> Double.compare(s2, s1)).distinct().forEach(System.out::println);//去重
        //如果希望自定义对象能够去重，需要重写对象的equals和hashCode方法！
        System.out.println("-----------------------");

        //3、映射/加工方法：把流上原来的数据拿出来变为新数据，再放入流中
        score.stream().map(s -> "加10分后：" + (s + 10)).forEach(System.out::println);
        System.out.println("-----------------------");

        //4、合并流
        Stream<String> s1 = Stream.of("张无忌", "赵敏", "周芷若");
        Stream<Integer> s2 = Stream.of(1, 2, 3, 4, 5);
        Stream<Object> s3 = Stream.concat(s1, s2);
        s3.forEach(s -> System.out.print(s + " "));
    }
}
