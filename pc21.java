import java.util.Scanner;

public class pc21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ang1, ang2, ang3;
        System.out.println("Enter  angle 1 (in deg) : ");
        ang1 = s.nextInt();
        System.out.println("Enter  angle 2 (in deg) : ");
        ang2 = s.nextInt();
        System.out.println("Enter  angle 3 (in deg) : ");
        ang3 = s.nextInt();

        if ((ang1 + ang2 + ang3) == 180) {
            System.out.println("Triangle is valid");

        } else {
            System.out.println("Triangle not valid ");
        }
    }
}