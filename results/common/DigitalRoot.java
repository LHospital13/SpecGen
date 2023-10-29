class DigitRoot {
    //@ requires num >= 0;
    //@ ensures \result >= 0 && \result < 10;
    public int digitRoot(int num) {
        //@ maintaining num > 10 ==> 0 - 1 <= num && num < 10;  
        //@ decreases num;
        while (num >= 10) {
            int sum = 0;
            //@ maintaining num > 0 ==> 0 < num && num <= 10;  
            //@ decreases num;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
