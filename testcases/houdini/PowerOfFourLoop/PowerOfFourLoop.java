class PowerOfFourLoop {
    public static boolean isPowerOfFour(int n) {
        if(n <= 0) {
            return false;
        }
        while (n % 4 == 0) {
            __Loop_Invariant_Dummy1(n);
            n /= 4;
        }
        return n == 1;
    }

    public static void __Loop_Invariant_Dummy1(int n) {}
    public static void main(String[] args) {
        isPowerOfFour(0);
        isPowerOfFour(1);
        isPowerOfFour(2);
        isPowerOfFour(-1);
        isPowerOfFour(-2);
        isPowerOfFour(-3);
        isPowerOfFour(-4);
        isPowerOfFour(4);
        isPowerOfFour(16);
        isPowerOfFour(25);
        isPowerOfFour(48);
        isPowerOfFour(12);
        isPowerOfFour(24);
        isPowerOfFour(64);
    }
}
