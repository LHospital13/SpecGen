class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        while (n != 0 && n % 3 == 0) {
            __Loop_Invariant_Dummy1(n);
            n /= 3;
        }
        return n == 1;
    }

    public static void __Loop_Invariant_Dummy1(int n) {}

    void __HoudiniInvoker() {
        isPowerOfThree(0);
        isPowerOfThree(1);
        isPowerOfThree(2);
        isPowerOfThree(-1);
        isPowerOfThree(-2);
        isPowerOfThree(3);
    }
}
