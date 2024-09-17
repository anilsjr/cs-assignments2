import java.util.Scanner;

public class pc5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2;
        System.out.println();
        System.out.print("Enter num1  : ");
        num1 = s.nextInt();
        System.out.print("Enter num2  : ");
        num2 = s.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("after interchange \nValue of num1 is : " + num1);
        System.out.println("Value of num2 is : " + num2);
    }
}
