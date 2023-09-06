class IsOneBitCharacter {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length, i = 0;
        while (i < n - 1) {
            i += bits[i] + 1;
        }
        return i == n - 1;
    }

    public void __HoudiniInvoker() {
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
        arr = new int[]{0, 0};
        isOneBitCharacter(arr);
    }
}