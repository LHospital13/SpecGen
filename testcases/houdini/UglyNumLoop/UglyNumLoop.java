class UglyNumLoop {
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            __Loop_Invariant_Dummy1(n);
            n /= 2;
        }
        while (n % 3 == 0) {
            __Loop_Invariant_Dummy2(n);
            n /= 3;
        }
        while (n % 5 == 0) {
            __Loop_Invariant_Dummy3(n);
            n /= 5;
        }
        return n == 1;
    }

    public static void __Loop_Invariant_Dummy1(int n) {}
    public static void __Loop_Invariant_Dummy2(int n) {}
    public static void __Loop_Invariant_Dummy3(int n) {}

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
        isUgly(15);
        isUgly(9);
        isUgly(45);
        isUgly(105);
        isUgly(25);
        isUgly(165);
    }
}
