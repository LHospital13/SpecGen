class MySqrt {
    public int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
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

    void __HoudiniInvoker() {
        mySqrt(0);
        mySqrt(1);
        mySqrt(2);
        mySqrt(4);
        mySqrt(8);
    }
}