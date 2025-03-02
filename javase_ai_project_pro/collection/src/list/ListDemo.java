package list;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //目标：用LinkedList做一个队列对象
        LinkedList<String> queue = new LinkedList<>();
        //入队
        queue.addLast("张三");
        queue.addLast("李四");
        queue.addLast("王五");
        queue.addLast("赵六");
        System.out.println(queue);

        //出队
        System.out.println(queue.removeFirst());

        System.out.println("---------------------------");

        //用LinkedList做栈
        LinkedList<String> stack = new LinkedList<>();
        //压栈
        stack.push("第1颗子弹");
        stack.push("第2颗子弹");
        stack.push("第3颗子弹");
        stack.push("第4颗子弹");
        System.out.println(stack);

        //出栈
        System.out.println(stack.pop());

    }
}
