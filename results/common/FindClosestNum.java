class FindClosestNum {
    //@ requires (\forall int i; 0 <= i && i < nums.length; Integer.MIN_VALUE <= nums[i] && nums[i] <= Integer.MAX_VALUE);
    //@ ensures (\exists int i; 0 <= i && i <= nums.length; \result == nums[i] ==> (\exists int j; 0 <= j && j <= nums.length; (i != j ==> (\result < nums[j]))));  
    public int findClosestNumber(int[] nums) {
        int ans = Integer.MAX_VALUE;

        //@ maintaining 0 <= i && i <= nums.length;
 
        //@ decreases nums.length - i;
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int absNum = (num<0?-num:num);
            int absAns = (ans<0?-ans:ans);
            if(absNum < absAns || (absNum == absAns && num > ans)) {
                ans = num;
            }
        }

        return ans;
    }
}
