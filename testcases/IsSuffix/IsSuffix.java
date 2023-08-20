public class IsSuffix {

    public boolean isSuffix (String pat, String txt) {
        int i = pat.length();
        int j = txt.length();

        while(i >= 0) {
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }

        return true;
    }

}