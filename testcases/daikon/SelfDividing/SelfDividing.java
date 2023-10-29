class SelfDividing {
    public static boolean isSelfDividable(int num) {
        int temp = num;
        while (temp > 0) {
            __Loop_Invariant_Dummy1(num, temp);
            int digit = temp % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }

    public static void __Loop_Invariant_Dummy1(int num, int temp) {}

    public static void main(String[] args) {
        isSelfDividable(-2);
        isSelfDividable(-1);
        isSelfDividable(0);
        isSelfDividable(1);
        isSelfDividable(2);
        isSelfDividable(13);
        isSelfDividable(128);
        isSelfDividable(25);
        isSelfDividable(49);
        isSelfDividable(64);
    }
}
