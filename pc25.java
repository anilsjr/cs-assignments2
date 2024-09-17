import java.util.Scanner;

public class pc25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double pp, sp;
        System.out.println("Enter  purchase price : ");
        pp = s.nextInt();
        System.out.println("Enter  Enter selling price : ");
        sp = s.nextInt();

        if (sp > pp) {
            System.out.println("profit");

        } else if (sp < pp) {
            System.out.println("loss");
        } else {
            System.out.println("loss hi huaa...");
        }
    }
}