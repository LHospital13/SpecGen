class PowerOfFourBranch {
    public static boolean isPowerOfFour(int n) {
        if(n <= 0) {
            return false;
        }
        if((n & (n - 1)) != 0) {
            return false;
        }
        if((n & 0xaaaaaaaa) != 0) {
            return false;
        }
        return true;
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
