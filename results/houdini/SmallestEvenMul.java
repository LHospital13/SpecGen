class SmallestEvenMul {
    //@ ensures \result != 1;
    //@ ensures \result != -1;
    //@ ensures n >= 0 ==> \result >= 0;
    public static int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : 2 * n;
    }

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        smallestEvenMultiple(-2);
        smallestEvenMultiple(-1);
        smallestEvenMultiple(0);
        smallestEvenMultiple(1);
        smallestEvenMultiple(2);
        smallestEvenMultiple(3);
        smallestEvenMultiple(4);
        smallestEvenMultiple(5);
        smallestEvenMultiple(114);
        smallestEvenMultiple(19919);
    }
}

