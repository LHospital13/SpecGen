class DominantIndex {
    
    public static int dominantIndex(int[] nums) {
        int m1 = -1, m2 = -1;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            __Loop_Invariant_Dummy1(nums, m1, m2, index, i);
            if (nums[i] > m1) {
                m2 = m1;
                m1 = nums[i];
                index = i;
            } else if (nums[i] > m2) {
                m2 = nums[i];
            }
        }

        return m1 >= m2 * 2 ? index : -1;
    }

    public static void __Loop_Invariant_Dummy1(int[] nums, int m1, int m2, int index, int i) {}

    public static void main(String[] args) {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        dominantIndex(arr);
        arr = new int[]{0};
        dominantIndex(arr);
        arr = new int[]{-2, -1};
        dominantIndex(arr);
        arr = new int[]{2, 3};
        dominantIndex(arr);
        arr = new int[]{0, 1, 10};
        dominantIndex(arr);
        arr = new int[]{-2, -3, 5, 114};
        dominantIndex(arr);
        arr = new int[]{-2, -3, 5, 514, 1919};
        dominantIndex(arr);
        arr = new int[]{-2, -3, 5, 514, 1919, 114514};
        dominantIndex(arr);
    }
}