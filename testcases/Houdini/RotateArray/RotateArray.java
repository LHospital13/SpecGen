
class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; ++i) {
            newArr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);
    }

    public void __HoudiniInvoker() {
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
        arr = new int[]{-2, -3};
        rotate(arr, -3);
    }
}
