package genericity;

import java.util.ArrayList;
import java.util.Objects;

public class GenericDemo {
    public static void main(String[] args) {
        //目标：认识泛型
        ArrayList<String> list = new ArrayList<String>();
        list.add("java");
        list.add("php");
        list.add("23");

        //获取数据
        for (int i = 0; i < list.size(); i++) {
//            Object rs = list.get(i);
//            //把数据转型处理
//            String s = (String) rs;
//            System.out.println(s);
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
