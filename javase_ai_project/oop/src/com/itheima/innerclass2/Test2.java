package com.itheima.innerclass2;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        //目标：完成数组排序，理解其中匿名内部类的使用。
        Student[] students = new Student[]{
                new Student("小明", 20, 170, '男'),
                new Student("小红", 19, 165, '女'),
                new Student("小刚", 18, 180, '男'),
                new Student("小花", 17, 165, '女'),
                new Student("小李", 16, 170, '男'),
        };
        //遍历
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        //排序:按照年龄升序排序，可以调用sun公司写好的API直接排序
        //public static <T> void sort(T[] a, Comparator<? super T> c)
        //              参数一：要排序的数组
        //              参数二：声明一个Comparator比较器，指定排序规则
        //sort内部会调用匿名内部类对象的compare方法，比较两个对象
//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                //指定排序规则
//                //如果左边对象大于右边，则返回正整数
//                //如果左边对象等于右边，则返回0
//                //如果左边对象小于右边，则返回负整数
////                if(o1.getAge()>o2.getAge()){
////                    return 1;
////                }
////                else if(o1.getAge()==o2.getAge()){
////                    return 0;
////                }
////                else{
////                    return -1;
////                }
//                return o1.getAge() - o2.getAge();//按照年龄升序排序
//            }
//        });
//        Arrays.sort(students, (o1,o2) -> o1.getAge() - o2.getAge());
        //还可以通过静态方法进一步简化
        //必须箭头前后参数形式一致
        Arrays.sort(students, Student::compareByAge);

        System.out.println("排序后：");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }


        //也可以通过实例方法简化
        Student s = new Student();
        Arrays.sort(students, s::compareByHeight);

        System.out.println("排序后：");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }


    }
}
