import java.util.Scanner;

public class pc22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Enter num : ");
        num = s.nextInt();

        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("num is divisible by both 11 and 5");
        } else if (num % 5 == 0 && num % 11 != 0) {
            System.out.println("num is divisible by 5 only");
        } else {
            System.out.println("num is divisible by 11 only");
        }

    }
}