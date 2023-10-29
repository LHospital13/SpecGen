class IsMonotonic {
    //@ requires nums != null;
 
 
    public boolean isMonotonic(int[] nums) {
        boolean inc = true, dec = true;
        int n = nums.length;
        //@ maintaining 0 <= i && i - 1 <= n - 1;  
        //@ maintaining inc ==> (\forall int k; 0 <= k && k < i; nums[k] <= nums[k + 1]);
        //@ maintaining dec ==> (\forall int k; 0 <= k && k < i; nums[k] >= nums[k + 1]);
        //@ decreases n - i;
        for (int i = 0; i < n - 1; ++i) {
            if (nums[i] > nums[i + 1]) {
                inc = false;
            }
            if (nums[i] < nums[i + 1]) {
                dec = false;
            }
        }
        return inc || dec;
    }
}

