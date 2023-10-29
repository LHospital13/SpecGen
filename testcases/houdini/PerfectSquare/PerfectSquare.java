class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if(num == 0)
            return true;

        for(int i = 1; i * i <= num; i++) {
            __Loop_Invariant_Dummy1(num, i);
            if(i * i == num)
                return true;
        }
        return false;
    }

    public static void __Loop_Invariant_Dummy1(int num, int i) {}

    void __HoudiniInvoker() {
        isPerfectSquare(0);
        isPerfectSquare(1);
        isPerfectSquare(2);
        isPerfectSquare(-1);
        isPerfectSquare(-2);
    }
}
