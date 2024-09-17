import java.util.Scanner;

public class pc14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2, num3, num4;
        System.out.println();
        System.out.print("Enter num1  : ");
        num1 = s.nextInt();
        System.out.print("Enter num2  : ");
        num2 = s.nextInt();
        System.out.print("Enter num3  : ");
        num3 = s.nextInt();
        System.out.print("Enter num4  : ");
        num4 = s.nextInt();

        if (num1 < num2 && num1 < num3 && num1 < num4) {
            System.out.println("Value of num1 is lowest : ");
        } else if (num2 < num1 && num2 < num3 && num2 < num4) {
            System.out.println("Value of num2 is lowest : ");
        } else if (num3 < num1 && num3 < num2 && num3 < num4) {
            System.out.println("Value of num3 is lowest : ");
        } else {
            System.out.println("Value of num4 is lowest : ");
        }

    }
}