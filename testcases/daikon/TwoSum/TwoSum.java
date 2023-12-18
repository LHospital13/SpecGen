class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            __Loop_Invariant_Dummy1(nums, target, n, i);
            for (int j = i + 1; j < n; ++j) {
                __Loop_Invariant_Dummy2(nums, target, n, i, j);
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void __Loop_Invariant_Dummy1(int[] nums, int target, int n, int i) {}
    
    public static void __Loop_Invariant_Dummy2(int[] nums, int target, int n, int i, int j) {}

    public static void main(String[] args) {
        int[] nums = new int[]{};
        twoSum(nums, 1);
        twoSum(nums, -114);
        twoSum(nums, 0);
        twoSum(nums, 114);

        nums = new int[]{1};
        twoSum(nums, 1);
        twoSum(nums, 114);
        twoSum(nums, 0);
        twoSum(nums, 114);


        nums = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        twoSum(nums, 1);
        twoSum(nums, 114);
        twoSum(nums, 0);
        twoSum(nums, 114);

        nums = new int[]{114, 2};
        twoSum(nums, 1);
        twoSum(nums, 116);

        nums = new int[]{1, 3, 2, -9};
        twoSum(nums, 5);
        twoSum(nums, 114);

        nums = new int[]{-114, 514, -114, -1919, -1919, 810, 14};
        twoSum(nums, 14);
        twoSum(nums, -228);


        nums = new int[]{-114, 514, -114, -1919, -1919, 810, 14, 0};
        twoSum(nums, 14);
        twoSum(nums, -1919);


        nums = new int[]{-114, 514, -1919, 810, 14};
        twoSum(nums, 14);
        twoSum(nums, 114514);
    }
}
