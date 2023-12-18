class DominantIndex {
    
    public static int dominantIndex(int[] nums) {
        int biggest_index = 0;

        for (int i = 0; i < nums.length; i++) {
            __Loop_Invariant_Dummy1(nums, biggest_index, i);
            if (nums[i] > nums[biggest_index])
                biggest_index = i;
        }

        for (int i = 0; i < nums.length; i++) {
            __Loop_Invariant_Dummy2(nums, biggest_index, i);
            if (i != biggest_index && 2 * nums[i] > nums[biggest_index])
                return -1;
        }

        return biggest_index;
    }

    public static void __Loop_Invariant_Dummy1(int[] nums, int biggest_index, int i) {}

    public static void __Loop_Invariant_Dummy2(int[] nums, int biggest_index, int i) {}

    public static void main(String[] args) {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        dominantIndex(arr);
        arr = new int[]{0};
        dominantIndex(arr);
        arr = new int[]{-2, -1};
        dominantIndex(arr);
        arr = new int[]{2, 3};
        dominantIndex(arr);
        arr = new int[]{2, 3, 114};
        dominantIndex(arr);
        arr = new int[]{2, 3, 4};
        dominantIndex(arr);
        arr = new int[]{3, 4, 5, 6};
        dominantIndex(arr);
        arr = new int[]{3, 4, 5, 6, 10, 11};
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