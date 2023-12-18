class PowerOfTwoLoop {
    public static boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            __Loop_Invariant_Dummy1(n);
            n /= 2;
        }
        return n == 1;
    }

    public static void __Loop_Invariant_Dummy1(int n) {}
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
