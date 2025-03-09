package reflectdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private int age;

    public void study() {
        System.out.println("学习java");
    }

    private void eat(String food) {
        System.out.println("我要吃" + food + " !");
    }
}
