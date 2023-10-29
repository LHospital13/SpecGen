class FindClosestNum {
    
    public int findClosestNumber(int[] nums) {
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int absNum = ((num >= 0) ? num : -num);
            int absAns = ((ans >= 0) ? ans : -ans);
            if(absNum < absAns || (absNum == absAns && num > ans)) {
                ans = num;
            }
        }

        return ans;
    }

    public void __HoudiniInvoker() {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        findClosestNumber(arr);
        arr = new int[]{0};
        findClosestNumber(arr);
        arr = new int[]{-2, -1};
        findClosestNumber(arr);
        arr = new int[]{2, 3};
        findClosestNumber(arr);
        arr = new int[]{0, 1};
        findClosestNumber(arr);
        arr = new int[]{-2, -3};
        findClosestNumber(arr);
    }
}