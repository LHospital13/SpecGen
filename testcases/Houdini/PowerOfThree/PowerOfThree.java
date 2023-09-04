class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        while (n != 0 && n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    void __HoudiniInvoker() {
        isPowerOfThree(0);
        isPowerOfThree(1);
        isPowerOfThree(2);
        isPowerOfThree(-1);
        isPowerOfThree(-2);
        isPowerOfThree(3);
    }
}
