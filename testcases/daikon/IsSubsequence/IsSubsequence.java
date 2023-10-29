class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        int i = 0, j = 0;

        while (i < n && j < m) {
            __Loop_Invariant_Dummy1(s, t, n, i, j);
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }

    public static void __Loop_Invariant_Dummy1(String s, String t, int n, int i, int j) {}

    public static void main(String[] args) {
        isSubsequence("abcde", "abcdefg");
        isSubsequence("a", "abc");
        isSubsequence("", "");
        isSubsequence("a", "");
        isSubsequence("", "ab");
        isSubsequence("114", "514");
        isSubsequence("114", "114514");
        isSubsequence("114514", "1141919514810");
    }
}
