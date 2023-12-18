class SmallestEvenMulBranch {
    public static int smallestEvenMultiple(int n) {
        if(n % 2 == 0) {
            return n;
        }
        return 2 * n;
    }

    public static void main(String[] args) {
        smallestEvenMultiple(0);
        smallestEvenMultiple(1);
        smallestEvenMultiple(2);
        smallestEvenMultiple(-1);
        smallestEvenMultiple(-2);
        smallestEvenMultiple(-3);
        smallestEvenMultiple(-4);
        smallestEvenMultiple(4);
        smallestEvenMultiple(16);
        smallestEvenMultiple(25);
        smallestEvenMultiple(48);
        smallestEvenMultiple(12);
        smallestEvenMultiple(24);
        smallestEvenMultiple(64);
    }
}