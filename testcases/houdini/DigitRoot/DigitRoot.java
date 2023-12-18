class DigitRoot {
    public static int digitRoot(int num) {
        while (num >= 10) {
            __Loop_Invariant_Dummy1(num);
            int sum = 0;
            while (num > 0) {
                __Loop_Invariant_Dummy2(num, sum);
                sum += num % 10;
                num /= 10;
            }
            __Loop_Invariant_Dummy2(num, sum);
            num = sum;
        }
        __Loop_Invariant_Dummy1(num);
        return num;
    }

    public static void __Loop_Invariant_Dummy1(int num) {}

    public static void __Loop_Invariant_Dummy2(int num, int sum) {}

    public static void main(String[] args) {
        digitRoot(-2);
        digitRoot(-1);
        digitRoot(0);
        digitRoot(1);
        digitRoot(2);
        digitRoot(12);
        digitRoot(4);
        digitRoot(5);
        digitRoot(114);
        digitRoot(514);
        digitRoot(1919);
        digitRoot(810);
    }
}
