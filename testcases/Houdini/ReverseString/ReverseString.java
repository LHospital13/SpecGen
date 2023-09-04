class ReverseString {
    public void reverseString(char[] s) {
        int n = s.length;
        for (int left = 0, right = n - 1; left < right; ++left, --right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
        }
    }

    public void __HoudiniInvoker() {
        char[] arr = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(arr);
        arr = new char[]{'a'};
        reverseString(arr);
        arr = new char[]{'b', 'a'};
        reverseString(arr);
        arr = new char[]{};
        reverseString(arr);
    }
}
