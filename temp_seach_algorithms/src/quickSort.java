import java.lang.reflect.Array;
import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int a[] = { 6, 7, 8, 5, 4, 1, 2, 3 };
        quickSort_TheBrownBox(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
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
}
