package stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher implements Comparable<Teacher> {
    private String name;
    private int age;
    private double salary;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}' + '\n';
    }

    //重写Comparable接口的compareTo方法
    //t2.compareTo(t1)
    //t2 == this
    //t1 == o
    //返回值：
    //正数：this大
    //0：this == o
    //负数：this小
    @Override
    public int compareTo(Teacher o) {
        //按照年龄升序
        return this.getAge() - o.getAge();
    }
}
