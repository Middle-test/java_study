package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {
        //目标：完成Map集合相关的案例：投票统计程序
        calc();
    }

    private static void calc() {
        //1、把80个学生选择的景点数据拿到程序中来才可以统计
        List<String> locations = new ArrayList<>();
        String[] name = {"玉龙雪山", "长城", "龙门石窟", "六尺巷"};
        for (int i = 0; i < 80; i++) {
            locations.add(name[(int) (Math.random() * name.length)]);
        }
//        System.out.println(locations);
        //2、最终统计结果是键值对形式，可以考虑使用Map集合来存储
        Map<String, Integer> map = new HashMap<>();
        //3、遍历集合，统计选择的次数
        for (String location : locations) {
            map.put(location, map.containsKey(location) ? map.get(location) + 1 : 1);
        }
        map.forEach((k, v) -> {
            System.out.println(k + "被选中" + v + "次");
        });
    }
}
