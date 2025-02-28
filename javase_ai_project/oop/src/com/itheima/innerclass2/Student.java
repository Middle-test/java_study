package com.itheima.innerclass2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    //姓名，年龄，身高，性别
    private String name;
    private int age;
    private double height;
    private char gender;

    public static int compareByAge(Student s1, Student s2) {
        return s1.getAge() - s2.getAge();
    }

    public int compareByHeight(Student s1, Student s2) {
        return Double.compare(s1.getHeight(), s2.getHeight());
    }
}
