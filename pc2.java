import java.util.Scanner;

public class pc2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l, b;
        double area;
        System.out.println();
        System.out.print("Enter length of rectangle  : ");
        l = s.nextInt();
        System.out.print("Enter breath of rectangle  : ");
        b = s.nextInt();
        area = l * b;
        System.out.println("Area  is : " + area);
    }
}
