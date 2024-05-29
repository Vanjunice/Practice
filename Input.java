package learn;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入");
        String name = scanner.next();
        int a = scanner.nextInt();
        System.out.println("输出");
        System.out.println(name + a);


    }
}
