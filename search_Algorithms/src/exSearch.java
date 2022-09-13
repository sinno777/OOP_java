public class exSearch {
    public static void main(String[] args) {

    }

    public static int searchMin(int a[]) {
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                index = i;
                break;
            }
        }
        return index;
    }
}
