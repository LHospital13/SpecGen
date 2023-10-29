class ReverseString {
    public static void reverseString(char[] s) {
        int n = s.length;
        for (int left = 0, right = n - 1; left < right; ++left, --right) {
            __Loop_Invariant_Dummy1(s, n, left, right);
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
        }
    }

    public static void __Loop_Invariant_Dummy1(char[] s, int n, int left, int right) {}

    public static void main(String[] args) {
        char[] arr = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(arr);
        arr = new char[]{'a'};
        reverseString(arr);
        arr = new char[]{'b', 'a'};
        reverseString(arr);
        arr = new char[]{};
        reverseString(arr);
        arr = new char[]{'1', '1', '4', '5', '1', '4'};
        reverseString(arr);
        arr = new char[]{'1', '9', '1', '9', '8', '1', '0'};
        reverseString(arr);
        arr = new char[]{'1', '9', '1', '9', '8', '1', '0', '0', '1'};
        reverseString(arr);
    }
}
