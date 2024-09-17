import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int marks;
        System.out.println("Enter your marks :");
        marks = s.nextInt();
        if (marks < 25) {
            System.out.println("your grade is : F");
        } else if (marks >= 25 && marks < 45) {
            System.out.println("your grade is : E");
        } else if (marks >= 45 && marks < 50) {
            System.out.println("your grade is : D");
        } else if (marks >= 60 && marks < 80) {
            System.out.println("your grade is : C");
        } else if (marks >= 60 && marks < 80) {
            System.out.println("your grade is : B");
        } else {
            System.out.println("your grade is : A");

        }

    }
}
