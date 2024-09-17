import java.util.Scanner;

public class pc11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println();
        System.out.print("Enter num : ");
        num = s.nextInt();
        switch (num % 2) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;

            default:
                System.out.println("wrong input");
                break;
        }

    }
}
