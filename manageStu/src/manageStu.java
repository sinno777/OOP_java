import java.util.Scanner;

import javax.print.FlavorException;
import javax.swing.SpinnerDateModel;

public class manageStu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float stdMark;
        float sj1, sj2, sj3;
        String area;
        int oj;

        System.out.println("StandMark: ");
        stdMark = Float.parseFloat(scan.nextLine());
        System.out.println("Three sj: ");
        sj1 = Float.parseFloat(scan.nextLine());
        sj2 = Float.parseFloat(scan.nextLine());
        sj3 = Float.parseFloat(scan.nextLine());
        System.out.println("Area: ");
        area = scan.nextLine();
        System.out.println("oject: ");
        oj = Integer.parseInt(scan.nextLine());

        double pMark = preferenceMark(area);
        double oMark = ojMark(oj);
        double sumMark = sumMark(sj1, sj2, sj3, pMark, oMark);

        System.out.println("Last result: " + sumMark);

        if (sumMark >= stdMark && sj1 * sj2 * sj3 != 0) {
            System.out.println("You pass");
        } else
            System.out.println("You fail");
    }

    public static double sumMark(float sj1, float sj2, float sj3, double pMark, double oMark) {
        double sum = 1.0 * (sj1 + sj2 + sj3) / 3 + pMark + oMark;
        return sum;
    }

    public static double preferenceMark(String area) {
        switch (area) {
            case "A":
                return 2.0;
            case "B":
                return 1.0;
            case "C":
                return 0.5;
            default:
                return 0;
        }
    }

    public static double ojMark(int oj) {
        switch (oj) {
            case 1:
                return 2.5;
            case 2:
                return 1.5;
            case 3:
                return 1.0;
            default:
                return 0;
        }
    }
}
