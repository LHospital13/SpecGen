public class ThreeConsecutiveOdds {

    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return false;
        }
        for (int i = 0; i <= n - 3; ++i) {
            if ((arr[i] & 1) != 0 && (arr[i + 1] & 1) != 0 && (arr[i + 2] & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public void __HoudiniInvoker() {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        Smallest(arr);
        arr = new int[]{0};
        Smallest(arr);
        arr = new int[]{-2, -1};
        Smallest(arr);
        arr = new int[]{2, 3};
        Smallest(arr);
        arr = new int[]{1, 3, 5};
        Smallest(arr);
        arr = new int[]{-2, -3};
        Smallest(arr);
    }
}
