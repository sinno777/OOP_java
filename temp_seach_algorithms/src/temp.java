import java.util.Scanner;

public class temp {
    final static int MIN = -100;
    final static int MAX = 100;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = inputConditions(scan);
        int a[] = { 6, 7, 8, 5, 4, 1, 2, 3 };
        // int a[] = arrRandom(n);
        // int a[] = inputArrHand(n, scan);
        quickSort_Cyber(a, 0, a.length - 1);
        exportArr(a);

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

    public static void sortConditions(Scanner scan, int a[]) {
        System.out.println("Min: ");
        int x = Integer.parseInt(scan.nextLine());
        System.out.println("Max: ");
        int y = Integer.parseInt(scan.nextLine());
        for (int item : a) {
            if (item >= x && item <= y)
                System.out.print(item + "\t");
        }
    }

    public static void quickSort_TheBrownBox(int a[], int l, int r) {
        // condition
        if (l > r)
            return;
        // divide
        int key = a[(l + r) / 2];

        // patition flow pivot
        int k = patition(a, l, r, key);
        // call back recursion
        quickSort_TheBrownBox(a, l, k - 1);
        quickSort_TheBrownBox(a, k, r);
    }

    // patition flow pivot
    public static int patition(int a[], int l, int r, int key) {
        int il = l;
        int ir = r;
        while (il <= ir) {
            while (il < key)
                il++;
            while (ir > key)
                ir++;
            if (il <= ir) {
                int temp = a[il];
                a[il] = a[ir];
                a[ir] = temp;
                ir++;
                il--;
            }
        }
        return il;
    }

    public static void quickSort_Cyber(int a[], int left, int right) {
        int l, j, x;
        x = a[(left + right) / 2];
        l = left; // 0
        j = right; // a.length - 1;
        do {
            while (a[l] < x)
                l++;
            while (a[j] > x)
                j--;
            if (i <= j) {
                int temp = a[l];
                a[l] = a[j];
                a[j] = temp;
                l++;
                j--;
            }
        } while (l < j);
        if (left < j)
            quickSort(a, left, j);
        if (i < right)
            quickSort(a, l, right);
    }

    public static void nextSearchIndex(int a[]) {
        int minIndex = firstNumPlus(a);
        if (minIndex == -1)
            System.out.println("Non value!!");
        else {
            System.out.println("Index next of minIndexPlus:");
            for (int i = minIndex + 1; i < a.length; i++) {
                if (a[i] == a[minIndex]) {
                    System.out.print(i + "\t");
                }
            }
        }
    }

    public static int firstNumPlus(int a[]) { // respone index
        int index = -1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > 0 && a[i] < a[i + 1]) {
                index = i;
            }
        }
        return index;
    }

    public static int NumPlus(int a[]) { // respone index
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int siteMin(int a[]) {
        int numIndex = firstNumPlus(a);
        int index = -1;
        if (numIndex == -1)
            System.out.println("Non value");
        else {
            index = numIndex;
            for (int i = numIndex + 1; i < a.length; i++) {
                if (a[i] > 0 && a[i] < a[index]) {
                    index = i;
                }
            }
        }
        return index;
    }

    public static void nextIndexSiteMin(int a[]) {
        int index = siteMin(a);
        if (index == -1)
            System.out.println("Non value");
        else {
            for (int i = index + 1; i < a.length; i++) {
                if (a[i] == a[index])
                    System.out.print(i + "\t");
            }
        }
    }

    public static int siteStuMaxAverage(int a[]) { // return average of stu
        int index = -1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                index = i;
            }
        }
        return index;
    }

    public static int siteStuNextMaxAverage(int a[]) { // return next stu max average
        int index = -1;
        int siteStuMaxAverage = siteStuMaxAverage(a);
        for (int i = siteStuMaxAverage; i < a.length; i++) {
            if (a[i] == a[siteStuMaxAverage])
                index = i;
        }
        return index;
    }


}
