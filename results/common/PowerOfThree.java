class PowerOfThree {
    //@ requires n > 0;
 
    public boolean isPowerOfThree(int n) {
        int temp = n;
        //@ maintaining temp >= 0;
 
        //@ decreases temp;
        while (temp != 0 && temp % 3 == 0) {
            temp /= 3;
        }
        return temp == 1;
    }
}
