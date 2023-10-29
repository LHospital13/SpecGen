class RotateArray {
    //@ requires nums != null;
    //@ requires 0 <= k;
    //@ requires \typeof(nums) == \type(int[]);
    //@ assignable nums[*];
    //@ ensures (\forall int i; 0 <= i && i < nums.length; nums[i] == \old(nums[(i + k) % nums.length]));
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        //@ maintaining 0 <= i && i <= n;
        //@ maintaining (\forall int j; 0 <= j && j < i; newArr[(j + k) % n] == nums[j]);
        //@ decreases n - i;
        for (int i = 0; i < n; ++i) {
            newArr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);
    }
}
