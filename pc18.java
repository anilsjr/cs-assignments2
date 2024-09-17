import java.util.Scanner;

public class pc18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Enter  a num : ");
        num = s.nextInt();
        while (num >= 0) {
            if (num == 0) {
                System.out.println("num is even");
                break;
            }
            if (num == 1) {
                System.out.println("num is odd");
                break;
            }
            num -= 2;
        }

    }
}
