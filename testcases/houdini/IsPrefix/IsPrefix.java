public class IsPrefix {

    public static boolean isPrefix (String pat, String txt) {
        int i = 0;

        while(i < pat.length()) {
            __Loop_Invariant_Dummy1(pat, txt, i);
            if(i >= txt.length() || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i + 1;
        }

        return true;
    }

    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i){}

    public static void __HoudiniInvoker() {
        isPrefix("abcde", "abcdefg");
        isPrefix("a", "abc");
        isPrefix("", "");
        isPrefix("a", "");
        isPrefix("", "ab");
    }
}