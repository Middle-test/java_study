package genericitydemo3;

import genericitydemo2.Student;

public class GenericDemo4 {
    public static void main(String[] args) {
        //目标：学会定义泛型方法
        //打印任意数组的内容
        String[] names = {"张三", "李四", "王五"};
        printArray(names);

        Student[] students = new Student[3];
        printArray(students);

        String max1 = getMax(names);
        Student max2 = getMax(students);

    }

    public static <T> void printArray(T[] names) {
    }

    public static <T> T getMax(T[] ary) {
        return null;
    }
}
