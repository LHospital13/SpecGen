class FizzBuzz {
    public static int fizzBuzz(int n) {
        int res = 0;
        if (n % 3 == 0) {
            res += 3;
        }
        if (n % 5 == 0) {
            res += 5;
        }
        return res;
    }

    public static void main(String[] args) {
        fizzBuzz(-2);
        fizzBuzz(-1);
        fizzBuzz(0);
        fizzBuzz(1);
        fizzBuzz(2);
	fizzBuzz(5);
        fizzBuzz(12);
        fizzBuzz(15);
    }
}
