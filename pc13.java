import java.util.Scanner;

public class pc13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch;
        int num1, num2;
        System.out.println();
        System.out.print("Enter num1  : ");
        num1 = s.nextInt();
        System.out.print("Enter num2  : ");
        num2 = s.nextInt();
        System.out.println();
        System.out.print("Enter operation to perform (+-/*%): ");
        ch = s.next().charAt(0);
        switch (ch) {
            case '-':
                System.out.println("num1 - num2 : " + (num1 - num2));
                break;
            case '+':
                System.out.println("num1 + num2 : " + (num1 + num2));
                break;
            case '*':
                System.out.println("num1 * num2  :" + (num1 * num2));
                break;
            case '/':
                System.out.println("num1 / num2  :" + (num1 / num2));
                break;
            case '%':
                System.out.println("num1 % num2 : " + (num1 % num2));
                break;

            default:
                System.out.println("Wrong input");
                break;
        }

    }
}
