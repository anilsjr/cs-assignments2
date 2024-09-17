import java.util.Scanner;

public class pc29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        int num1, num2;
        System.out.println();
        System.out.print("Enter num1  : ");
        num1 = s.nextInt();
        System.out.print("Enter num2  : ");
        num2 = s.nextInt();
        System.out.println();
        System.out.print("Enter operation to perform (+ or > or ==): ");
        str = s.next();
        switch (str) {
            case "+":
                System.out.println("num1 + num2 : " + (num1 + num2));
                break;
            case ">":
                if (num1 > num2) {
                    System.out.println("num1");
                } else {
                    System.out.println("num2");

                }
                break;
            case "==":
                if (num1 == num2) {
                    System.out.println("num1 and num2 are  equal");
                } else {
                    System.out.println("num1 and num2 are NOT equal");
                }
                break;

            default:
                System.out.println("Wrong input");
                break;
        }

    }
}
