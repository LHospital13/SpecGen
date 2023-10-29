class Merge {
    //@ requires nums1 != null && nums2 != null;
    //@ ensures \result != null && \result.length == nums1.length + nums2.length;
 
 
    public static int[] merge(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int p1 = 0, p2 = 0;
        int[] sorted = new int[m + n];
        int cur;
        //@ maintaining 0 <= p1 && p1 <= m;
        //@ maintaining 0 <= p2 && p2 <= n;
        //@ maintaining p1 + p2 <= m + n;
 
 
        //@ decreases m + n - (p1 + p2);
        while (p1 < m || p2 < n) {
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
        return sorted;
    }
}
