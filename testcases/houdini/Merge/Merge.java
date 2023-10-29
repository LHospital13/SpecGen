class Merge {
    public void merge(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int p1 = 0, p2 = 0;
        int[] sorted = new int[m + n];
        int cur;
        while (p1 < m || p2 < n) {
            __Loop_Invariant_Dummy1(num1, num2, m, n, p1, p2, sorted, cur);
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            sorted[p1 + p2 - 1] = cur;
        }
        for (int i = 0; i != m + n; ++i) {
            nums1[i] = sorted[i];
        }
    }

    public static void __Loop_Invariant_Dummy1(int[] nums1, int[] nums2, int m, int n, int p1, int p2, int[] sorted, int cur) {}

    public void __HoudiniInvoker() {
        int[] arr1 = new int[]{-2, -1, 0, 1, 2, 3};
        int[] arr2 = new int[]{-2, -1, 0, 1, 2};
        merge(arr1, arr2);
        arr1 = new int[]{0};
        arr2 = new int[]{-2, -1};
        merge(arr1, arr2);
        arr1 = new int[]{-2, -1};
        arr2 = new int[]{0, 1};
        merge(arr1, arr2);
        arr1 = new int[]{2, 3};
        arr2 = new int[]{2, 3};
        merge(arr1, arr2);
        arr1 = new int[]{0, 1};
        arr2 = new int[]{-2, -1, 0, 1, 2, 3};
        merge(arr1, arr2);
        arr1 = new int[]{-2, 3};
        arr2 = new int[]{0};
        merge(arr1, arr2);
    }
}
