import java.util.Scanner;

public class pc17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Enter  a num : ");
        num = s.nextInt();
        if (num >= 0) {
            System.out.println("num  is positive : ");
        } else {
            System.out.println("num  is negative : ");
        }
    }
}
