import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int percent;
        System.out.println("Enter your percentage score :");
        percent = s.nextInt();
        if (percent < 60) {
            System.out.println("your grade is : D");
        } else if (percent >= 60 && percent < 80) {
            System.out.println("your grade is : C");
        } else if (percent >= 80 && percent < 90) {
            System.out.println("your grade is : B");
        } else if (percent >= 90) {
            System.out.println("your grade is : A");
        }

    }
}
