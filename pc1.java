import java.util.Scanner;

public class pc1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int radi;
        double area;
        System.out.println();
        System.out.print("Enter radius of circle  : ");
        radi = s.nextInt();
        area = 3.14 * radi * radi;
        System.out.println("Area  is : " + area);
    }
}
