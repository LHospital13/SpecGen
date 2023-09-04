class DigitRoot {
    public int digitRoot(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public void __HoudiniInvoker() {
        digitRoot(-2);
        digitRoot(-1);
        digitRoot(0);
        digitRoot(1);
        digitRoot(2);
        digitRoot(12);
    }
}
