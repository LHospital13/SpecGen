
class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        while(k < 0) {
            k = k + n;
        }
        int[] newArr = new int[n];
        int i = 0;
        for (i = 0; i < n; ++i) {
            __Loop_Invariant_Dummy1(nums, k, n, newArr, i);
            newArr[(i + k) % n] = nums[i];
        }
        __Loop_Invariant_Dummy1(nums, k, n, newArr, i);
        System.arraycopy(newArr, 0, nums, 0, n);
    }

    public static void __Loop_Invariant_Dummy1(int[] nums, int k, int n, int[] newArr, int i) {}

    public static void main(String[] args) {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        rotate(arr, -2);
        arr = new int[]{0};
        rotate(arr, 0);
        arr = new int[]{-2, -1};
        rotate(arr, -1);
        arr = new int[]{2, 3};
        rotate(arr, 2);
        arr = new int[]{0, 1};
        rotate(arr, 1);
        arr = new int[]{-2, -3, -4};
        rotate(arr, -3);
        arr = new int[]{114, 514, 1919};
        rotate(arr, 4);
    }
}
