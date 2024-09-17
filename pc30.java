import java.util.Scanner;
import java.time.LocalDate;

public class pc30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LocalDate date = LocalDate.now();

        int unit = 0, price = 10;
        double discount = 0, discountedPrice = 0, total, AP = 0, DP = 0;
        String name, gift = "";
        char gen, carryBag;
        System.out.print(" name : ");
        name = s.next();
        System.out.print("gender (M/F) : ");
        gen = s.next().charAt(0);

        System.out.println("                        Dmart");
        System.out.println("Name : " + name + "\t\t\t\t\t  Date : " + date);
        System.out.println("---------------------------------------------------------");
        System.out.println("Item Name  Quantity  Price     Total       After-Discount   ");

        for (int i = 1; i <= 10; i++) {
            price = 10 * i;
            System.out.print("Item-" + i + " : \t");
            unit = s.nextInt();
            total = price * unit;
            AP += total;

            switch (i) {
                case 1:
                    if (quantity >= 5) {
                        discount = 5;
                    }
                    break;
                case 5:
                    discount = 10;
                    break;
                case 10:
                    discount = 15;
                    break;

                default:
                    break;
            }
            discountedPrice = total * (1 - discount / 100);
            DP += discountedPrice;

            System.out.println("\t\t\t" + price + " \t" + total + "\t\t " +
                    discountedPrice);

        }

        System.out.println("---------------------------------------------------------");

        if (AP >= 10000) {
            discount = 15;
            DP = AP * (1 - discount / 100);
        } else if (AP >= 5000 && AP < 10000) {
            discount = 15;
            DP = AP * (1 - discount / 100);
        }

        System.out.println(" \t\t\t\t\t A.P    \t  D.P ");
        System.out.println("  \t\t\t   " + AP + " \t    " + DP);

        if (gen == 'F') {
            gift = "Cadeberry";
        } else if (gen == 'M') {
            gift = "Ladger Wallet";
        }

        System.out.println("Gift :- " + gift + "               0.0   \t  0.0  ");

        System.out.print("Carry Bag : ");
        carryBag = s.next().charAt(0);

        if (carryBag == 'Y') {
            price = 10;
        } else if (carryBag == 'N') {
            price = 0;
        } else {
            price = 0;
        }

        System.out.println("   \t\t\t\t" + price + " \t\t " + price);

    }
}
