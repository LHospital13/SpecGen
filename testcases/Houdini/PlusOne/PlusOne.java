class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public void __HoudiniInvoker() {
        int[] arr = new int[]{1, 0, 1, 0};
        plusOne(arr);
        arr = new int[]{0};
        plusOne(arr);
        arr = new int[]{1};
        plusOne(arr);
        arr = new int[]{1, 1, 0};
        plusOne(arr);
        arr = new int[]{1, 0, 0, 0, 1, 0};
        plusOne(arr);
        arr = new int[]{0, 0};
        plusOne(arr);
    }
}