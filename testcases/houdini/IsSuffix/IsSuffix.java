public class IsSuffix {

    public boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }

        return true;
    }

    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    public void __HoudiniInvoker() {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
    }

}
