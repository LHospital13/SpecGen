import java.util.PriorityQueue;

class KthLargest {
    public static int kthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            __Loop_Invariant_Dummy1(nums, k, pq, i);
            int x = nums[i];
            pq.offer(x);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }

    public static void __Loop_Invariant_Dummy1(int[] nums, int k, PriorityQueue<Integer> pq, int i) {}

    public static void main(String[] args) {
        int[] arr = new int[]{-2, -1, 8};
        kthLargest(arr, 1);
        arr = new int[]{2, 3};
        kthLargest(arr, 2);
        arr = new int[]{0, 1, 213, 703, 713};
        kthLargest(arr, 3);
        arr = new int[]{-2, 2, 114, 514, 810, 114514};
        kthLargest(arr, 4);
        arr = new int[]{-2, 2, 114, 512, 513, 511, 810, 927, 999, 114514};
        kthLargest(arr, 7);
    }
}