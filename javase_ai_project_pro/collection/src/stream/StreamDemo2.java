package stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        //目标：获取Stream流
        //1、集合获取Stream流
        Collection<String> list = new ArrayList<>();
        Stream<String> s1 = list.stream();

        //2、Map集合获取Stream流
        Map<String, Integer> map = new HashMap<>();
        //获取键流
        Stream<String> s2 = map.keySet().stream();
        //获取值流
        Stream<Integer> s3 = map.values().stream();
        //获取键值对流
        Stream<Map.Entry<String, Integer>> s4 = map.entrySet().stream();

        //3、数组获取Stream流
        String[] arr = {"林青霞", "张曼玉", "王祖蓝"};
        Stream<String> s5 = Arrays.stream(arr);
        Stream<String> s6 = Stream.of(arr);
        Stream<String> s7 = Stream.of("林青霞", "张曼玉", "王祖蓝");
    }
}
