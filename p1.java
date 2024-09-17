import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        int l, b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length  :  ");
        l = s.nextInt();
        System.out.print("Enter breath  :  ");
        b = s.nextInt();
        if (l == b) {
            System.out.println("it is a square ");
        } else {
            System.out.println("it is Not a square ");

        }
    }
}