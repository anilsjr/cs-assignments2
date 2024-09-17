import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        float cost = 100;
        int unit = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter unit to buy :  ");
        unit = s.nextInt();

        if (unit > 100) {
            cost *= (float)0.9;
        }
        System.out.print("total cost of unit is :  " + cost * unit);

    }
}
