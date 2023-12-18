class NumberOfCutsSeq {
    public static int numberOfCuts(int n) {
        return ((n == 1) ? 0 : ((n % 2 == 0) ? (n / 2) : n));
    }
    
    public static void main(String[] args) {
        numberOfCuts(0);
        numberOfCuts(1);
        numberOfCuts(2);
        numberOfCuts(3);
        numberOfCuts(8);
    }
}
