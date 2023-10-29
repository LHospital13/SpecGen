class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        isPowerOfTwo(0);
        isPowerOfTwo(1);
        isPowerOfTwo(2);
        isPowerOfTwo(-1);
        isPowerOfTwo(-2);
        isPowerOfTwo(4);
        isPowerOfTwo(7);
        isPowerOfTwo(8);
    }
}
