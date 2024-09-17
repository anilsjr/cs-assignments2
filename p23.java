import java.util.Scanner;

public class p23 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Enter day num :");
        num = s.nextInt();
        switch (num / 7) {
            case 0:
                System.out.println("week 1");
                break;
            case 1:
                System.out.println("week 2");
                break;
            case 2:
                System.out.println("week 3");
                break;
            case 3:
                System.out.println("week 4");
                break;
            case 4:
                System.out.println("week 5");
                break;

            default:
                System.out.println("Wrong input");
                break;

        }
    }
}
