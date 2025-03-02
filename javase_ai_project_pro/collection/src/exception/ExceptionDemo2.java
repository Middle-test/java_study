package exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            div(10, 2);
            System.out.println("除法运算成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("底层方法失败");
        }
    }

    public static void div(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("除数不能为0");
        }
        System.out.println(a / b);
    }
}
