class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n & 0xaaaaaaaa) == 0;
    }

    void __HoudiniInvoker() {
        isPowerOfFour(0);
        isPowerOfFour(1);
        isPowerOfFour(2);
        isPowerOfFour(-1);
        isPowerOfFour(-2);
        isPowerOfFour(4);
    }
}
