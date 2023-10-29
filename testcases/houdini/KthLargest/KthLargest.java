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
}