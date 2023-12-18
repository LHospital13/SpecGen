class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        int temp = n;
        while (temp != 0 && temp % 3 == 0) {
            __Loop_Invariant_Dummy1(temp);
            temp /= 3;
        }
        __Loop_Invariant_Dummy1(temp);
        return temp == 1;
    }

    public static void __Loop_Invariant_Dummy1(int temp) {}

    public static void main(String[] args) {
        isPowerOfThree(0);
        isPowerOfThree(1);
        isPowerOfThree(2);
        isPowerOfThree(-1);
        isPowerOfThree(-2);
        isPowerOfThree(3);
        isPowerOfThree(9);
        isPowerOfThree(27);
        isPowerOfThree(81);
        isPowerOfThree(45);
    }
}
