public class RepeatedNumNested {
    public static int repeatedNum(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            __Loop_Invariant_Dummy1(arr, i);
            for (int j = i + 1; j < arr.length; ++j) {
                __Loop_Invariant_Dummy2(arr, i, j);
                if(arr[i] == arr[j])
                    return i;
            }
        }
        return -1;
    }

    public static void __Loop_Invariant_Dummy1(int[] arr, int i) {}

    public static void __Loop_Invariant_Dummy2(int[] arr, int i, int j) {}

    public static void main(String[] args) {
        int[] arr = new int[]{};
        repeatedNum(arr);
        arr = new int[]{1};
        repeatedNum(arr);
        arr = new int[]{1, -2};
        repeatedNum(arr);
        arr = new int[]{1, 1};
        repeatedNum(arr);
        arr = new int[]{1, 2, -7};
        repeatedNum(arr);
        arr = new int[]{1, 1, 2};
        repeatedNum(arr);
        arr = new int[]{7, 1, 3};
        repeatedNum(arr);
        arr = new int[]{-8, 1, 0, 1};
        repeatedNum(arr);
        arr = new int[]{9, 0, 8, -1, 8};
        repeatedNum(arr);
        arr = new int[]{9, 0, 114, -1, 114};
        repeatedNum(arr);
        arr = new int[]{9, -23, 8, -23, 8};
        repeatedNum(arr);
        arr = new int[]{9, -23, 8, 23, -8, 3, 514};
        repeatedNum(arr);
    }
}