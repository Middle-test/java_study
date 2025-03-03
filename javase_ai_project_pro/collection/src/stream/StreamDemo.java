package stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        //目标：认识Stream流，掌握基本使用步骤
        List<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("赵敏");
        list.add("周芷若");
        list.add("张强");

        //1、先用传统方案：找出姓张的人，名字为3个字的，放入新的集合中
        List<String> newList = new ArrayList<>();
        for (String name : list) {
            if (name.contains("张") && name.length() == 3) {
                newList.add(name);
            }
        }
        System.out.println(newList);

        //2、用Stream流实现
        List<String> newList2 = list.stream().filter(name -> name.contains("张")).filter(s -> s.length() == 3).collect(Collectors.toList());
    }
}


