class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            __Loop_Invariant_Dummy1(digits, i);
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void __Loop_Invariant_Dummy1(int[] digits, int i) {}

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 1, 0};
        plusOne(arr);
        arr = new int[]{0};
        plusOne(arr);
        arr = new int[]{1};
        plusOne(arr);
        arr = new int[]{1, 1, 4};
        plusOne(arr);
        arr = new int[]{5, 1, 4};
        plusOne(arr);
        arr = new int[]{9, 9, 9};
        plusOne(arr);
        arr = new int[]{1, 9, 1, 9};
        plusOne(arr);
        arr = new int[]{1, 9, 1, 9, 8, 1, 0};
        plusOne(arr);
        arr = new int[]{9};
        plusOne(arr);
        arr = new int[]{9, 9};
        plusOne(arr);
        arr = new int[]{9, 9, 9, 9};
        plusOne(arr);
    }
}