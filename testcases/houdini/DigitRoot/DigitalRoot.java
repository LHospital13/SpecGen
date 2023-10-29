class DigitRoot {
    public int digitRoot(int num) {
        while (num >= 10) {
            __Loop_Invariant_Dummy1(num);
            int sum = 0;
            while (num > 0) {
                __Loop_Invariant_Dummy2(num, sum);
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void __Loop_Invariant_Dummy1(int num) {}

    public static void __Loop_Invariant_Dummy2(int num, int sum) {}

    public void __HoudiniInvoker() {
        digitRoot(-2);
        digitRoot(-1);
        digitRoot(0);
        digitRoot(1);
        digitRoot(2);
        digitRoot(12);
    }
}
