class FindClosestNum {
    
    public static int findClosestNumber(int[] nums) {
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

    public static void main(String[] args) {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        findClosestNumber(arr);
        arr = new int[]{0};
        findClosestNumber(arr);
        arr = new int[]{15, -1};
        findClosestNumber(arr);
        arr = new int[]{2, 3};
        findClosestNumber(arr);
        arr = new int[]{0, 1};
        findClosestNumber(arr);
        arr = new int[]{-2, -3};
        findClosestNumber(arr);
        arr = new int[]{-2, -1, 8};
        findClosestNumber(arr);
        arr = new int[]{2, 3};
        findClosestNumber(arr);
        arr = new int[]{0, 1, 213, 703, 713};
        findClosestNumber(arr);
        arr = new int[]{-2, 2, 114, 514, 810, 114514};
        findClosestNumber(arr);
        arr = new int[]{114, 512, 513, 514, 810, 927, 999, 114514};
        findClosestNumber(arr);
    }
}