import java.util.Scanner;

public class pc3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mark_S, mark_T;
        double percent;
        System.out.println();
        System.out.print("Enter total marks : ");
        mark_T = s.nextInt();
        System.out.print("Enter marks scored  : ");
        mark_S = s.nextInt();
        percent = 100 * mark_S / mark_T;
        System.out.println("perccent  is : " + percent + "% ");
    }
}
