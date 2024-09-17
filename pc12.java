import java.util.Scanner;

public class pc12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch;
        System.out.println();
        System.out.print("Enter char (a-z): ");
        ch = s.next().charAt(0);
        switch (ch) {
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;

            default:
                System.out.println("not a vowel");
                break;
        }

    }
}
