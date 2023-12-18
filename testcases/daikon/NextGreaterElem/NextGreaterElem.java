class NextGreaterElem {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] res = new int[m];
        for (int i = 0; i < m; ++i) {
            int j = 0;
            while (j < n && nums2[j] != nums1[i]) {
                ++j;
            }
            int k = j + 1;
            while (k < n && nums2[k] < nums2[j]) {
                ++k;
            }
            res[i] = k < n ? nums2[k] : -1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};
        nextGreaterElement(a, b);
        a = new int[]{0};
        b = new int[]{0};
        nextGreaterElement(a, b);
        a = new int[]{0};
        b = new int[]{0, 1};
        nextGreaterElement(a, b);
        a = new int[]{0, 1};
        b = new int[]{0, 1};
        nextGreaterElement(a, b);
        a = new int[]{0, 1};
        b = new int[]{0, 1, 2};
        nextGreaterElement(a, b);
        a = new int[]{0, 1, 2};
        b = new int[]{0, 1, 2};
        nextGreaterElement(a, b);
        a = new int[]{0, 1, 2};
        b = new int[]{0, 1, 2, 6};
        nextGreaterElement(a, b);
        a = new int[]{0, 1, 2};
        b = new int[]{114, 1, 2, 0};
        nextGreaterElement(a, b);
        a = new int[]{2, 1, 114, 0};
        b = new int[]{114, 1919, 2, 1, 0};
        nextGreaterElement(a, b);
        

    }
}
