class MySqrt {
    //@ requires x >= 0;
    //@ requires x != -1;
    //@ requires x >= -1;
    //@ requires x > -1;
    public int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            __Loop_Invariant_Dummy1(x, l, r, ans);
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    //@ requires x >= 0;
    //@ requires x != -1;
    //@ requires x >= -1;
    //@ requires x > -1;
    //@ requires r >= l;
    public static void __Loop_Invariant_Dummy1(int x, int l, int r, int ans) {}

    void __HoudiniInvoker() {
        mySqrt(0);
        mySqrt(1);
        mySqrt(2);
        mySqrt(4);
        mySqrt(8);
    }
}

