public class IsPrefix {

    public boolean isPrefix (String pat, String txt) {
        int i = 0;

        while(i < pat.length()) {
            if(i >= txt.length() || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i + 1;
        }

        return true;
    }

    public void __HoudiniInvoker() {
        isPrefix("abcde", "abcdefg");
        isPrefix("a", "abc");
        isPrefix("", "");
        isPrefix("a", "");
        isPrefix("", "ab");
    }
}