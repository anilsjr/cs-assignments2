import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int yearOfSrevice;
        double salary, bonusPercent = 0.05;
        System.out.println("Enter your Salary : ");
        salary = s.nextInt();
        System.out.println("Enter your year of service i this company : ");
        yearOfSrevice = s.nextInt();
        if (yearOfSrevice >= 5) {
            salary *= (1 + bonusPercent);
        }

        System.out.println("Now your Salary will be: " + salary);

    }
}
