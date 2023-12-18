class MinInArray {
    public static int minElementInArray(int[] arr) {
        if (arr.length == 0) return -1;
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            __Loop_Invariant_Dummy1(arr, res, i);
            res = ((arr[i] < res) ? arr[i] : res);
        }
        return res;
    }

    public static void __Loop_Invariant_Dummy1(int[] arr, int res, int i) {}

    public static void main(String[] args) {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        minElementInArray(arr);
        arr = new int[]{0};
        minElementInArray(arr);
        arr = new int[]{-2, -1};
        minElementInArray(arr);
        arr = new int[]{2, 3};
        minElementInArray(arr);
        arr = new int[]{0, 1};
        minElementInArray(arr);
        arr = new int[]{0, 0, 0};
        minElementInArray(arr);
        arr = new int[]{-2, -3};
        minElementInArray(arr);
        arr = new int[]{0, 4};
        minElementInArray(arr);
        arr = new int[]{-2, -1, 8};
        minElementInArray(arr);
        arr = new int[]{2, 3};
        minElementInArray(arr);
        arr = new int[]{0, 1};
        minElementInArray(arr);
        arr = new int[]{-2, -3, 2, 114, 514, 810, 114514};
        minElementInArray(arr);
    }
}


