package map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //目标：认识Map集合的体系特点
        //1、创建Map集合
        //Map/HashMap特点：无序、不重复、无索引
        //LinkedMap特点：有序、不重复、无索引
        //TreeMap特点：排序、不重复、无索引
        Map<String, Integer> map = new HashMap<>();//一行经典代码
        map.put("张三", 18);
        map.put("李四", 19);
        map.put("王五", 20);
        System.out.println(map);

        //常用操作
        //1、添加元素
        map.put("赵六", 21);
        System.out.println(map);

        //2、修改元素
        map.put("赵六", 22);
        System.out.println(map);

        //3、删除元素
        map.remove("赵六");
        System.out.println(map);

        //4、查询元素
        System.out.println(map.get("张三"));

        //5、判断是否包含键
        System.out.println(map.containsKey("张三"));

        //6、判断是否包含值
        System.out.println(map.containsValue(18));

        //7、获取键的集合
        System.out.println(map.keySet());//Set<String>集合

        //8、获取值的集合
        System.out.println(map.values());//Collection<Integer>集合
    }
}
