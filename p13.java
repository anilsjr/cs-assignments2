import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Enter num :");
        num = s.nextInt();
        switch (num) {
            case 1:
                System.out.println("today is monday");
                break;
            case 2:
                System.out.println("today is tuesday");
                break;
            case 3:
                System.out.println("today is wednesday");
                break;
            case 4:
                System.out.println("today is thusday");
                break;
            case 5:
                System.out.println("today is friday");
                break;
            case 6:
                System.out.println("today is saturday");
                break;
            case 7:
                System.out.println("today is sunday");
                break;
            default:
                System.out.println("Wrong input");
                break;

        }
    }
}
