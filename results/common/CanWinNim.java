class CanWinNim {
    //@ requires n >= 0;
    //@ ensures \result == true <==> n % 4 != 0;
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}


