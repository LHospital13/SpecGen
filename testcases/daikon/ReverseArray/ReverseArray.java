public class ReverseArray {
    public static int[] reverse(int[] original) {
        int n = original.length;
        int[] res = new int[n];
        for(int i = 0; i < n ; i++) {
            __Loop_Invariant_Dummy1(original, n, res, i);
            res[i] = original[n - i - 1];
        }
        return res;
    }

    public static void __Loop_Invariant_Dummy1(int[] original, int n, int[] res, int i) {}

    public static void main(String[] args) {
        int[] arr = new int[]{};
        reverse(arr);
        arr = new int[]{1};
        reverse(arr);
        arr = new int[]{1, -2};
        reverse(arr);
        arr = new int[]{1, 1};
        reverse(arr);
        arr = new int[]{1, 2, -7};
        reverse(arr);
        arr = new int[]{1, 1, 2};
        reverse(arr);
        arr = new int[]{7, 1, 3};
        reverse(arr);
        arr = new int[]{-8, 1, 0, 1};
        reverse(arr);
        arr = new int[]{9, 0, 8, -1, 8};
        reverse(arr);
        arr = new int[]{9, 0, 114, -1, 114};
        reverse(arr);
        arr = new int[]{9, -23, 8, -23, 8};
        reverse(arr);
        arr = new int[]{9, -23, 8, 23, -8, 3, 514};
        reverse(arr);
    }
}
