import java.util.Scanner;

public class arrange {
    static final int MAX = 100;
    static final int MIN = -100;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("n: ");
        int n = Integer.parseInt(scan.nextLine());
        int a[] = initArray(n);
        exportArr(a);
        a = buble_sort(a);
        exportArr(a);
    }

    public static int[] importArr(Scanner scan, int n) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = Integer.parseInt(scan.nextLine());
        }
        return a;
    }

    public static int[] initArray(int n) {
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

    public static int[] interchange_sort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) { // increase-sort
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static int[] buble_sort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        return a;
    }

    public static int searchSiteMIN(int a[], int k) {
        int siteMIN = k;
        for (int i = k + 1; i < a.length; i++) {
            if (a[i] < a[siteMIN])
                siteMIN = i;
        }
        return siteMIN;
    }

    public static int[] selection_sort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int siteMIN = searchSiteMIN(a, i);
            int temp = a[i];
            a[i] = a[siteMIN];
            a[siteMIN] = temp;
        }
        return a;
    }

    public static void quickSort(int a[], int left, int right) {
        int i, j, x;
        x = a[(left + right) / 2];
        i = left; // 0
        j = right; // a.length - 1;
        do {
            while (a[i] < x)
                i++;
            while (a[j] > x)
                j--;
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        } while (i < j);
        if (left < j)
            quickSort(a, left, j);
        if (i < right)
            quickSort(a, i, right);
    }
}
