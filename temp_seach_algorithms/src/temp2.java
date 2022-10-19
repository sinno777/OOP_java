import java.util.Scanner;

public class temp2 {
    final static int MIN = -100;
    final static int MAX = 20;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = inputConditions(scan);
        int a[] = arrRandom(n);
        exportArr(a);
        searchMinAm(a);
    }

    public static int[] inputArrHand(int n, Scanner scan) {
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = Integer.parseInt(scan.nextLine());
        }
        return a;
    }

    public static int inputConditions(Scanner scan) {
        int n;
        do {
            System.out.println("Conditions is n > 0: ");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 0);
        return n;
    }

    public static int[] arrRandom(int n) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
        }
        return a;
    }

    public static void exportArr(int a[]) {
        for (int item : a) {
            System.out.print(item + "\t");
        }
        System.out.println("\n");
    }

    public static void searchMinAm(int a[]) {
        int firstIndex = -1;
        for (int i : a) {
            if (a[i] < 0) {
                firstIndex = i;
                break;
            }
        }

        if (firstIndex == -1)
            System.out.println("Non value Am");
        else {
            int indexMinAM = -1;
            for (int i = firstIndex + 1; i < a.length; i++) {
                if (a[i] < a[firstIndex]) {
                    indexMinAM = i;
                }
            }
        }

        if (indexMinAM == -1)
            System.out.println("result: " + a[indexMinAM]);
        else {
            for (int i = indexMinAM + 1; i < a.length; i++) {
                if (a[i] == a[indexMinAM]) {
                    System.out.println(i + "\t");
                }
            }
        }
    }

}
