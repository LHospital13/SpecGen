class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if(num == 0)
            return true;
        int i;
        for(i = 1; i * i <= num; i++) {
            __Loop_Invariant_Dummy1(num, i);
            if(i * i == num)
                return true;
        }
        __Loop_Invariant_Dummy1(num, i);
        return false;
    }

    //@ requires num != 0;
    public static void __Loop_Invariant_Dummy1(int num, int i) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isPerfectSquare(0);
        isPerfectSquare(1);
        isPerfectSquare(2);
        isPerfectSquare(-1);
        isPerfectSquare(-2);
        isPerfectSquare(4);
        isPerfectSquare(25);
        isPerfectSquare(5);
        isPerfectSquare(49);
        isPerfectSquare(16);
    }
}


