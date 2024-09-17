import java.util.Scanner;

public class pc6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2;
        System.out.println();
        System.out.print("Enter num1  : ");
        num1 = s.nextInt();
        System.out.print("Enter num2  : ");
        num2 = s.nextInt();

        if (num1 > num2) {
            System.out.println("Value of num1 is greater : ");
        } else if (num1 < num2) {
            System.out.println("Value of num2 is greater : ");
        } else {
            System.out.println("Value of num1 and num2 are EQUAL : ");

        }

    }
}
