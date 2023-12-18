class IsSubsequence {
    //@ ensures s == null ==> \result;
    //@ ensures s == null ==> !\result;
    //@ ensures t == null ==> \result;
    //@ ensures t == null ==> !\result;
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

    //@ requires n >= 0;
    //@ requires n != -1;
    //@ requires n >= -1;
    //@ requires n > -1;
    //@ requires i < n;
    //@ requires i <= n;
    //@ requires i != n;
    public static void __Loop_Invariant_Dummy1(String s, String t, int n, int i, int j) {}

    public static void __HoudiniInvoker() {
        isSubsequence("abcde", "abcdefg");
        isSubsequence("a", "abc");
        isSubsequence("", "");
        isSubsequence("a", "");
        isSubsequence("", "ab");
    }
}
