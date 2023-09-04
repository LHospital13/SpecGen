class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    void __HoudiniInvoker() {
        isPowerOfTwo(0);
        isPowerOfTwo(1);
        isPowerOfTwo(2);
        isPowerOfTwo(-1);
        isPowerOfTwo(-2);
    }
}
