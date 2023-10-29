import java.util.PriorityQueue;

class KthLargest {
    public static int kthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for (int x : nums) {
            pq.offer(x);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }
}
