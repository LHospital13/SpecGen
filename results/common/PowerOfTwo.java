class PowerOfTwo {
    //@ requires n > 0;
    //@ ensures \result ==> (n & (n - 1)) == 0;
    //@ ensures !\result ==> (n <= 0 || (n & (n - 1)) != 0);
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}

