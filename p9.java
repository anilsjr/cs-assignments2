import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch;
        System.out.println("Enter char :");
        ch = s.next().charAt(0);

        if (ch >= 97 && ch <= 122) {
            System.out.println("Entered char is of lower case");
        } else if (ch >= 65 && ch <= 90) {
            System.out.println("Entered char is of upper case");

        }

    }
}