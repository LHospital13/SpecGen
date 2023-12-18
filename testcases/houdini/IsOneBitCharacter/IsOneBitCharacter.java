class IsOneBitCharacter {
    public static boolean isOneBitCharacter(int[] bits) {
        int n = bits.length, i = 0;
        while (i < n - 1) {
            __Loop_Invariant_Dummy1(bits, n, i);
            i += bits[i] + 1;
        }
        __Loop_Invariant_Dummy1(bits, n, i);
        return i == n - 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 1, 0};
        isOneBitCharacter(arr);
        arr = new int[]{0};
        isOneBitCharacter(arr);
        arr = new int[]{1};
        isOneBitCharacter(arr);
        arr = new int[]{1, 1, 0};
        isOneBitCharacter(arr);
        arr = new int[]{1, 0, 0, 0, 1, 0};
        isOneBitCharacter(arr);
        arr = new int[]{1, 0, 0, 0, 1, 0, 1};
        isOneBitCharacter(arr);
        arr = new int[]{1, 0, 0, 0, 1, 0, 1, 1};
        isOneBitCharacter(arr);
        arr = new int[]{1, 0, 0, 0, 1, 0, 1, 1, 1, 1};
        isOneBitCharacter(arr);
        arr = new int[]{0, 0, 0, 0, 1, 0, 1, 1, 1, 1};
        isOneBitCharacter(arr);
        arr = new int[]{1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0};
        isOneBitCharacter(arr);
        arr = new int[]{0, 0};
        isOneBitCharacter(arr);
        arr = new int[]{0, 0, 0, 0, 0, 0};
        isOneBitCharacter(arr);
        arr = new int[]{0, 0, 0, 0, 0};
        isOneBitCharacter(arr);
        arr = new int[]{0, 0, 0, 0};
        isOneBitCharacter(arr);
    }

    public static void __Loop_Invariant_Dummy1(int[] bits, int n, int i) {}
}