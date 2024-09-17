import java.util.*;

public class p5 {
    public static void main(String[] args) {
        int age1, age2, age3;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ages of person1 :");
        age1 = s.nextInt();
        System.out.println("Enter ages of person2 :");
        age2 = s.nextInt();
        System.out.println("Enter ages of person3 :");
        age3 = s.nextInt();

        if (age1 > age2 && age1 > age3) {
            System.out.println("person1 is older:");
        } else if (age2 > age1 && age2 > age3){
            System.out.println("person2 is older:");
        }
         else {
            System.out.println("person3 is older:");
        } 

    }
}
