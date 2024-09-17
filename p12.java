import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, revNum = 0, rem;
        System.out.println("Enter a num. between (1000-9999):");
        num = s.nextInt();
        if (num >= 1000 && num <= 9999) {

            while (num != 0) {
                rem = num % 10;
                revNum = revNum * 10 + rem;
                num /= 10;
            }

            System.out.println("REVESRE of num.  is:" + revNum);
        } else {
            System.out.println("no. is not in range of 1000-9999");
        }
    }
}
