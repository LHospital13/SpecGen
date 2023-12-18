public class IsAscending {
    public static boolean isAscending (int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return true;
        }
        int i = 0;
        for (i = 0; i < n - 1; i++) {
            __Loop_Invariant_Dummy1(arr, n, i);
            if(arr[i] >= arr[i+1])
                return false;
        }
        __Loop_Invariant_Dummy1(arr, n, i);
        return true;
    }

    public static void __Loop_Invariant_Dummy1(int[] arr, int n, int i) {}

    public static void main(String[] args) {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        isAscending(arr);
        arr = new int[]{0};
        isAscending(arr);
        arr = new int[]{-2, -1};
        isAscending(arr);
        arr = new int[]{2, 3};
        isAscending(arr);
        arr = new int[]{0, 1};
        isAscending(arr);
        arr = new int[]{-2, -3};
        isAscending(arr);
        arr = new int[]{0, -3, 1, 10};
        isAscending(arr);
        arr = new int[]{-3, 0, 1, 10};
        isAscending(arr);
        arr = new int[]{-2, -3, 0};
        isAscending(arr);
        arr = new int[]{-2, -1, 8};
        isAscending(arr);
        arr = new int[]{2, 2};
    }
}
