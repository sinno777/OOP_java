import java.sql.RowId;
import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Import array: ");
        int n = Integer.parseInt(scan.nextLine());
        int a[] = initA(scan, n);
        exportArr(a);
        System.out.println("Import x: ");
        int x = Integer.parseInt(scan.nextLine());
        int linearSearchRs = linearSearch(a, x);
        if (linearSearchRs == -1)
            System.out.println("No see: ");
        else
            System.out.println("see");

        // binarySearch
        boolean found = binarySearch(a, x);
        if (found)
            System.out.println("See");
        else
            System.out.println("No see");
        // if (found != -1)
        // System.out.println("See " + x + " at the index " + found);
        // else
        // System.out.println("No see " + x);
    }

    public static int[] initA(Scanner scan, int n) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = Integer.parseInt(scan.nextLine());
        }
        return a;
    }

    public static void exportArr(int a[]) {
        System.out.println("Array inited ");
        for (int i : a) {
            System.out.print(i + "\t");
        }
        System.out.println("\n");
    }

    public static int linearSearch(int a[], int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x)
                return i;
        }
        return -1;
    }

    public static boolean binarySearch(int a[], int x) {
        int left = 0;
        int right = a.length - 1;
        int mid;
        do {
            mid = (right + left) / 2;
            if (a[mid] == x)
                return true;
            else if (a[mid] > x)
                right = mid - 1;
            else
                left = mid + 1;
        } while (left <= right);
        return false;
    }

    public static int binarySearchIndex(int a[], int x) {
        int left = 0;
        int right = a.length - 1;
        int mid;
        do {
            mid = (right + left) / 2;
            if (a[mid] == x)
                return mid;
            else if (a[mid] > x)
                right = mid - 1;
            else
                left = mid + 1;
        } while (left <= right);
        return -1;
    }
}
