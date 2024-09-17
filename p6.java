import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Enter number :");
        num = s.nextInt();
        if (num < 0) {
            num *= -1;
        }
        System.out.println("absolute value is :" + num);

    }
}
