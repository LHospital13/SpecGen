class FizzBuzz {
    public int fizzBuzz(int n) {
        int res = 0;
        if (n % 3 == 0) {
            res += 3;
        }
        if (n % 5 == 0) {
            res += 5;
        }
        return res;
    }

    public void __HoudiniInvoker() {
        fizzBuzz(-2);
        fizzBuzz(-1);
        fizzBuzz(0);
        fizzBuzz(1);
        fizzBuzz(2);
        fizzBuzz(12);
        fizzBuzz(15);
    }
}