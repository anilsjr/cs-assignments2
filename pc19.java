import java.util.Scanner;

public class pc19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int s1, s2, s3;
        System.out.println("Enter  side 1 : ");
        s1 = s.nextInt();
        System.out.println("Enter  side 2 : ");
        s2 = s.nextInt();
        System.out.println("Enter  side 3 : ");
        s3 = s.nextInt();

        if ((s1 != s2 && s1 != s3 && s2 != s3)) {
            System.out.println("Triangle is scalene");

        } else if (s1 == s2 && s1 == s3) {
            System.out.println("Triangle is equilateral ");
        } else {
            System.out.println("Triangle is isosceles ");
        }

    }
}
