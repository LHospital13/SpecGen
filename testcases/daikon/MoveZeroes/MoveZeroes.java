class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            __Loop_Invariant_Dummy1(nums, n, left, right);
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public static void __Loop_Invariant_Dummy1(int[] nums, int n, int left, int right) {}

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        moveZeroes(arr);
        arr = new int[]{0};
        moveZeroes(arr);
        arr = new int[]{-2, -1};
        moveZeroes(arr);
        arr = new int[]{2, 3};
        moveZeroes(arr);
        arr = new int[]{0, 1};
        moveZeroes(arr);
        arr = new int[]{-2, -3};
        moveZeroes(arr);
        arr = new int[]{0, -3, 1, 10};
        moveZeroes(arr);
        arr = new int[]{-3, 0, 1, 10};
        moveZeroes(arr);
        arr = new int[]{-2, -3, 0};
        moveZeroes(arr);
        arr = new int[]{-2, -1, 8};
        moveZeroes(arr);
        arr = new int[]{2, 2};
        moveZeroes(arr);
        arr = new int[]{2, 2, 0, 0, 2, 2, 0};
        moveZeroes(arr);
        arr = new int[]{0, 1, 213, 703, 713, -32};
        moveZeroes(arr);
        arr = new int[]{0, 1, 213, 703, 713, 1919};
        moveZeroes(arr);
        arr = new int[]{-2, 2, 114, 514, 810, 114514};
        moveZeroes(arr);
        arr = new int[]{114, 512, 513, 514, 810, 927, 999, 0, 114514};
        moveZeroes(arr);
        
    }
}
