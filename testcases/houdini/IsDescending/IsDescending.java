public class IsDescending {
    public static boolean isDescending (int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return true;
        }
        int i = 0;
        for (i = 0; i < n-1 ; i++) {
            __Loop_Invariant_Dummy1(arr, n, i);
            if(arr[i] <= arr[i+1])
                return false;
        }
        __Loop_Invariant_Dummy1(arr, n, i);
        return true;
    }

    public static void __Loop_Invariant_Dummy1(int[] arr, int n, int i) {}

    public static void main(String[] args) {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        isDescending(arr);
        arr = new int[]{0};
        isDescending(arr);
        arr = new int[]{-2, -1};
        isDescending(arr);
        arr = new int[]{2, 3};
        isDescending(arr);
        arr = new int[]{0, 1};
        isDescending(arr);
        arr = new int[]{-2, -3};
        isDescending(arr);
        arr = new int[]{0, -3, 1, 10};
        isDescending(arr);
        arr = new int[]{-3, 0, 1, 10};
        isDescending(arr);
        arr = new int[]{-2, -3, 0};
        isDescending(arr);
        arr = new int[]{-2, -1, 8};
        isDescending(arr);
        arr = new int[]{2, 2};
        isDescending(arr);
        arr = new int[]{0, 1, 213, 703, 713, -32};
        isDescending(arr);
        arr = new int[]{713, 703, 29, 28, 4, -1};
        isDescending(arr);
        arr = new int[]{0, 1, 213, 703, 713, 1919, 1243546};
        isDescending(arr);
        arr = new int[]{124, 29, 12, 4, 3, 2, -1};
        isDescending(arr);
        arr = new int[]{114, 512, 513, 514, 810, 927, 999, 0, 114514};
        isDescending(arr);
    }
}