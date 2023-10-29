class UglyNum {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        int[] factors = {2, 3, 5};
        for (int i = 0; i < factors.length; i++) {
            __Loop_Invariant_Dummy1(n, factors, i);
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }

    public static void __Loop_Invariant_Dummy1(int n, int[] factors, int i) {}
}
