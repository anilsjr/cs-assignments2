import java.util.Scanner;

public class p15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long cost;
        System.out.println("Enter cost of  bike:");
        cost = s.nextInt();
        if (cost > 0 && cost <= 50000) {
            System.out.println("road tax to be paid is : 5%");
        } else if (cost > 50000 && cost < 100000) {
            System.out.println("road tax to be paid is : 10%");
        } else if (cost >= 100000) {
            System.out.println("road tax to be paid is : 15%");
        }
    }
}
