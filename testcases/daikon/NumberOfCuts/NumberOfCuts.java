class NumberOfCuts {
    public static int numberOfCuts(int n) {
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return n / 2;
        }
        return n;
    }

    public static void main(String[] args) {
        numberOfCuts(0);
        numberOfCuts(1);
        numberOfCuts(2);
        numberOfCuts(3);
        numberOfCuts(8);
    }
}