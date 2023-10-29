class SmallestEvenMul {
    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : 2 * n;
    }

    void __HoudiniInvoker() {
        smallestEvenMultiple(-2);
        smallestEvenMultiple(-1);
        smallestEvenMultiple(0);
        smallestEvenMultiple(1);
        smallestEvenMultiple(2);
    }
}