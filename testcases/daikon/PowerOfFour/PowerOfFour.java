class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n & 0xaaaaaaaa) == 0;
    }

    public static void main(String[] args) {
        isPowerOfFour(0);
        isPowerOfFour(1);
        isPowerOfFour(2);
        isPowerOfFour(-1);
        isPowerOfFour(-2);
        isPowerOfFour(4);
        isPowerOfFour(16);
        isPowerOfFour(25);
        isPowerOfFour(64);
    }
}
