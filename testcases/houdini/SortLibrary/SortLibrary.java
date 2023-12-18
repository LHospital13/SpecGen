import java.util.Arrays;

public class SortLibrary {
    public static void sort(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{};
        sort(arr);
        arr = new int[]{1};
        sort(arr);
        arr = new int[]{1, -2};
        sort(arr);
        arr = new int[]{1, 1};
        sort(arr);
        arr = new int[]{1, 2, -7};
        sort(arr);
        arr = new int[]{1, 1, 2};
        sort(arr);
        arr = new int[]{7, 1, 3};
        sort(arr);
        arr = new int[]{7, 3, 1};
        sort(arr);
        arr = new int[]{-8, 1, 0, 1};
        sort(arr);
        arr = new int[]{9, 0, 8, -1, 8};
        sort(arr);
        arr = new int[]{9, 0, 114, -1, 114};
        sort(arr);
        arr = new int[]{9, -23, 8, -23, 8};
        sort(arr);
        arr = new int[]{9, -23, 8, 23, -8, 3, 514};
        sort(arr);
    }
}
