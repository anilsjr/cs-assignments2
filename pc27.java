import java.util.Scanner;

public class pc27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int basicSalary, grossSalary, HRA = 25, DA = 90;
        System.out.println("Enter your base salary :");
        basicSalary = s.nextInt();

        if (basicSalary >= 20000) {
            HRA = 30;
            DA = 95;
        }
        // grossSalary = basicSalary*;
    }
}
