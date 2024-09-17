import java.util.Scanner;

public class pc9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println();
        System.out.print("Enter num  (1-5): ");
        num = s.nextInt();
        switch (num) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            default:
                System.out.println("wrong input");
                break;
        }

    }
}
