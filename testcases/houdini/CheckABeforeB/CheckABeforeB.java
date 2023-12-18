class CheckABeforeB {
    public static boolean checkString(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        while (i < chars.length && chars[i] == 'a') {
            __Loop_Invariant_Dummy1(s, chars, i);
            i++;
        }
        __Loop_Invariant_Dummy1(s, chars, i);
	    int j = i;
        while (j < chars.length && chars[j] == 'b') {
            __Loop_Invariant_Dummy2(s, chars, i, j);
            j++;
        }
        __Loop_Invariant_Dummy2(s, chars, i, j);
        return j == chars.length;
    }

    public static void __Loop_Invariant_Dummy1(String s, char[] c, int i) {}

    public static void __Loop_Invariant_Dummy2(String s, char[] c, int i, int j) {}

    public static void main(String[] args) {
        checkString("a");
        checkString("b");
        checkString("aabb");
        checkString("abab");
        checkString("");
        checkString("abbbbaaaabbb");
        checkString("aaaaaaaaaaaabbbbbbbbbb");
        
    }
}
