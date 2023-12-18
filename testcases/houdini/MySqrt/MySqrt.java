class MySqrt {
    public static int mySqrt(int x) {
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
        __Loop_Invariant_Dummy1(x, l, r, ans);
        return ans;
    }

    public static void __Loop_Invariant_Dummy1(int x, int l, int r, int ans) {}

    public static void main(String[] args) {
        mySqrt(0);
        mySqrt(1);
        mySqrt(2);
        mySqrt(4);
        mySqrt(8);
        mySqrt(25);
        mySqrt(24);
    }
}