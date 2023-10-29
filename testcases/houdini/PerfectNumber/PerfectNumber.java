class PerfectNumber {
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 1;
        for (int d = 2; d * d <= num; ++d) {
            __Loop_Invariant_Dummy1(num, sum, d);
            if (num % d == 0) {
                sum += d;
                if (d * d < num) {
                    sum += num / d;
                }
            }
        }
        return sum == num;
    }

    public static void __Loop_Invariant_Dummy1(int num, int sum, int d) {}

    public static void __HoudiniInvoker() {
        isPerfectNumber(-2);
        isPerfectNumber(-1);
        isPerfectNumber(0);
        isPerfectNumber(1);
        isPerfectNumber(2);
        isPerfectNumber(3);
        isPerfectNumber(4);
        isPerfectNumber(16);
    }
}
