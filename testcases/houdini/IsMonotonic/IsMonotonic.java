class IsMonotonic {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true, dec = true;
        int n = nums.length;
        for (int i = 0; i < n - 1; ++i) {
            __Loop_Invariant_Dummy1(nums, inc, dec, n, i)
            if (nums[i] > nums[i + 1]) {
                inc = false;
            }
            if (nums[i] < nums[i + 1]) {
                dec = false;
            }
        }
        return inc || dec;
    }

    public static void __Loop_Invariant_Dummy1(int[] nums, boolean inc, boolean dec, int n, int i) {}

    public static void __HoudiniInvoker() {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        isMonotonic(arr);
        arr = new int[]{0};
        isMonotonic(arr);
        arr = new int[]{-2, -1};
        isMonotonic(arr);
        arr = new int[]{2, 3};
        isMonotonic(arr);
        arr = new int[]{0, 1};
        isMonotonic(arr);
        arr = new int[]{-2, -3};
        isMonotonic(arr);
        arr = new int[]{};
        isMonotonic(arr);
    }
}