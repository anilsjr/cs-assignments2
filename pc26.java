import java.util.Scanner;

public class pc26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mChem, mPhy, mComp, mMath, mBio, Totalmarks, percent, Obtainedmarks;
        System.out.println("Enter your marks in chemistry :");
        mChem = s.nextInt();
        System.out.println("Enter your marks in physics :");
        mPhy = s.nextInt();
        System.out.println("Enter your marks in MAths :");
        mMath = s.nextInt();
        System.out.println("Enter your marks in biology :");
        mBio = s.nextInt();
        System.out.println("Enter your marks in computer :");
        mComp = s.nextInt();
        System.out.println("Enter Maximum marks  :");
        Totalmarks = s.nextInt();

        Obtainedmarks = mChem + mPhy + mMath + mBio + mComp;
        percent = 100 * Obtainedmarks / Totalmarks;

        if (percent < 40) {
            System.out.println("your grade is : F");
        } else if (percent >= 40) {
            System.out.println("your grade is : E");
        } else if (percent >= 60) {
            System.out.println("your grade is : D");
        } else if (percent >= 70) {
            System.out.println("your grade is : C");
        } else if (percent >= 80) {
            System.out.println("your grade is : B");
        } else if (percent >= 90) {
            System.out.println("your grade is : A");

        }

    }
}
