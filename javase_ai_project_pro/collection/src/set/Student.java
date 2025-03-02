package set;

import java.util.Objects;

public class Student {
    private String name;
    private char sex;
    private int age;
    private String home;


    public Student() {

    }

    public Student(String name, char sex, int age, String home) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.home = home;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", home='" + home + '\'' +
                '}' + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && Objects.equals(name, student.name) && Objects.equals(home, student.home);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, home);
    }
}
