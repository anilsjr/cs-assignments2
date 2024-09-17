import java.util.Scanner;

public class pc20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch;
        System.out.println("Enter char : ");
        ch = s.next().charAt(0);

        if (ch >= 65 && ch <= 90) {
            System.out.println("char is an alphabet");

        } else if (ch >= 97 && ch <= 122) {
            System.out.println("char is an alphabet");
        } else {
            System.out.println("char is NOT an alphabet");
        }

    }
}