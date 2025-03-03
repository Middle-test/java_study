package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTraverseDemo {
    public static void main(String[] args) {
        //目标：遍历Map集合
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 18);
        map.put("李四", 19);
        map.put("王五", 20);
        map.put("赵六", 21);

        //1、把Map转换为Set集合，里面的元素是Map.Entry类型(键值对类型)
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        //2、遍历Set集合，得到每一个键值对对象
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }

        System.out.println("-----------------------");

        //调用Map的foreach方法遍历
        map.forEach((k, v) -> {
            System.out.println(k + "-->" + v);
        });
    }
}
