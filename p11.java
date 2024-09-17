import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age;
        char gender, maritalStatus;
        System.out.println("Enter age :");
        age = s.nextInt();
        System.out.println("Enter gender (M or F) :");
        gender = s.next().charAt(0);
        System.out.println("Enter marital Status (Y or N) :");
        maritalStatus = s.next().charAt(0);

        if (gender == 'F') {
            System.out.println("you will work in urban areas only");
        } else if (gender == 'M' && age >= 20 && age < 40) {
            System.out.println("you will work in any area");
        } else if (gender == 'M' && age >= 40 && age < 60) {
            System.out.println("you will work in urban areas only");
        } else {
            System.out.println("ERROR \nage should be between 20 - 60 yr only");

        }

    }
}
