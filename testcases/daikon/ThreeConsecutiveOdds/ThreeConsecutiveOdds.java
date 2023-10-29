public class ThreeConsecutiveOdds {

    public static boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return false;
        }
        for (int i = 0; i <= n - 3; ++i) {
            __Loop_Invariant_Dummy1(arr, n, i);
            if ((arr[i] & 1) != 0 && (arr[i + 1] & 1) != 0 && (arr[i + 2] & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public static void __Loop_Invariant_Dummy1(int[] arr, int n, int i) {}

    public static void main(String[] args) {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        threeConsecutiveOdds(arr);
        arr = new int[]{0};
        threeConsecutiveOdds(arr);
        arr = new int[]{-2, -1};
        threeConsecutiveOdds(arr);
        arr = new int[]{2, 3};
        threeConsecutiveOdds(arr);
        arr = new int[]{1, 3, 5};
        threeConsecutiveOdds(arr);
        arr = new int[]{-2, -3};
        threeConsecutiveOdds(arr);
        arr = new int[]{0, 1, 213, 703, 713, -32};
        threeConsecutiveOdds(arr);
        arr = new int[]{0, 1, 213, 703, 713, 713};
        threeConsecutiveOdds(arr);
        arr = new int[]{-2, 2, 114, 514, 810, 114514};
        threeConsecutiveOdds(arr);
        arr = new int[]{114, 51, 513, 515, 810, 927, 999, 0, 114514};
        threeConsecutiveOdds(arr);
        arr = new int[]{114, 51, 513, 515, 810, 927, 999, 0, 114514, 1293};
        threeConsecutiveOdds(arr);
        arr = new int[]{1, 1, 1, 1, 1};
        threeConsecutiveOdds(arr);
    }
}
