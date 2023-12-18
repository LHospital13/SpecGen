class IsMonotonic {
    public static boolean isMonotonic(int[] nums) {
        boolean inc = true, dec = true;
        int n = nums.length;
        int i = 0;
        for (i = 0; i < n - 1; ++i) {
            __Loop_Invariant_Dummy1(nums, inc, dec, n, i);
            if (nums[i] > nums[i + 1]) {
                inc = false;
            }
            if (nums[i] < nums[i + 1]) {
                dec = false;
            }
        }
        __Loop_Invariant_Dummy1(nums, inc, dec, n, i);
        return inc || dec;
    }

    public static void __Loop_Invariant_Dummy1(int[] nums, boolean inc, boolean dec, int n, int i) {}

    public static void main(String[] args) {
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
        arr = new int[]{0, -3, 1, 10};
        isMonotonic(arr);
        arr = new int[]{-3, 0, 1, 10};
        isMonotonic(arr);
        arr = new int[]{-2, -3, 0};
        isMonotonic(arr);
        arr = new int[]{-2, -1, 8};
        isMonotonic(arr);
        arr = new int[]{2, 2};
        isMonotonic(arr);
        arr = new int[]{2, 2, 3, 1, 2};
        isMonotonic(arr);
        arr = new int[]{0, 1, 213, 703, 713};
        isMonotonic(arr);
        arr = new int[]{713, 703, 29, 28, 4, -1};
        isMonotonic(arr);
        arr = new int[]{0, 1, 213, 703, 713, 1919, 1243546};
        isMonotonic(arr);
        arr = new int[]{124, 29, 12, 4, 3, 2, -1};
        isMonotonic(arr);
        arr = new int[]{114, 512, 513, 514, 810, 927, 999, 0, 114514};
        isMonotonic(arr);
    }
}