import java.util.Scanner;

public class pc15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year;
        System.out.println("Enter year :");
        year = s.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Entered year is  a leap year");
        } else if (year % 400 == 0) {
            System.out.println("Entered year is  leap year");
        } else {
            System.out.println("Entered year is  NOT a leap year");
        }

    }
}
