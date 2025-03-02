package genericity;

public class GenericDemo2 {
    public static void main(String[] args) {
        //目标：自定义泛型类
        //模拟ArrayList集合自定义一个集合MyArrayList
        MyArrayList<String> list = new MyArrayList<String>();
        list.add("java");
        list.add("php");
        list.add("python");
        list.add("c++");
//        list.add(23);报错
        list.remove("java");
        System.out.println(list);
    }
}
