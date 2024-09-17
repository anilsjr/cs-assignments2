import java.util.Scanner;

public class pc28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int units, count = 0;
        double bill = 0;
        System.out.println("enter electricity unit");
        units = s.nextInt();

        if (count == 1) {
            bill += 50 * 0.5;
        } else if (count == 2) {
            bill += 100 * 0.75;
        } else if (count == 3) {
            bill += 100 * 1.20;
        }

        else if (count == 4) {
            bill += 250 * 1.50;
        }
    }
}
