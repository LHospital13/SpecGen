class CheckABeforeB {
    public boolean checkString(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        while (i < chars.length && chars[i] == 'a') {
            __Loop_Invariant_Dummy1(s, chars, i);
            i++;
        }
	    int j = i;
        while (j < chars.length && chars[j] == 'b') {
            __Loop_Invariant_Dummy2(s, chars, i, j);
            j++;
        }
        return j == chars.length;
    }

    public static void __Loop_Invariant_Dummy1(String s, char[] c, int i) {}

    public static void __Loop_Invariant_Dummy2(String s, char[] c, int i, int j) {}

    public void __HoudiniInvoker() {
        checkString("a");
        checkString("b");
        checkString("aabb");
        checkString("abab");
        checkString("");
    }
}
