class UglyNum {
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        int temp = n;
        int[] factors = {2, 3, 5};
        for (int i = 0; i < factors.length; i++) {
            __Loop_Invariant_Dummy1(n, temp, factors, i);
            int factor = factors[i];
            while (temp % factor == 0) {
                temp /= factor;
            }
        }
        return temp == 1;
    }

    public static void __Loop_Invariant_Dummy1(int n, int temp, int[] factors, int i) {}

    public static void main(String[] args) {
        isUgly(0);
        isUgly(1);
        isUgly(2);
        isUgly(3);
        isUgly(15);
        isUgly(-1);
        isUgly(-2);
        isUgly(-3);
		isUgly(4);
        isUgly(5);
        isUgly(7);
        isUgly(8);
		isUgly(13);
		isUgly(17);
		isUgly(12);
		isUgly(16);
    }
}
