class PowerOfTwoBranch {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if ((n & (n - 1)) != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        isPowerOfTwo(0);
        isPowerOfTwo(1);
        isPowerOfTwo(2);
        isPowerOfTwo(-1);
        isPowerOfTwo(-2);
        isPowerOfTwo(-3);
        isPowerOfTwo(-4);
        isPowerOfTwo(4);
        isPowerOfTwo(16);
        isPowerOfTwo(25);
        isPowerOfTwo(48);
        isPowerOfTwo(12);
        isPowerOfTwo(24);
        isPowerOfTwo(64);
    }
}
