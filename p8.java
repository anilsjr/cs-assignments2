import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tClass, aClass;
        String medical;
        double percent;
        System.out.println("Enter Total no of classes held :");
        tClass = s.nextInt();
        System.out.println("Enter no of classes you attended :");
        aClass = s.nextInt();
        System.out.println("is there is any medical cause ('Y'or'N') :");
        medical = s.next();

        percent = 100 * aClass / tClass;

        if (medical == "Y") {
            System.out.println("you are eligible to give exam");
        } else if (percent < 75) {
            System.out.println("you are Not eligible to give exam");
        } else {
            System.out.println("you are eligible to give exam");

        }
    }
}
