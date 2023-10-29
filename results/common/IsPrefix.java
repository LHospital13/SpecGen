public class IsPrefix {

    //@ requires pat != null && txt != null;
    //@ ensures \result <==> (\forall int i; 0 <= i && i < pat.length(); i < txt.length() && pat.charAt(i) == txt.charAt(i));
    public boolean isPrefix (String pat, String txt) {
        int i = 0;

        //@ maintaining 0 <= i && i <= pat.length();
        //@ maintaining (\forall int k; 0 <= k && k < i; k < txt.length() && pat.charAt(k) == txt.charAt(k));
        //@ decreases pat.length() - i;
        while(i < pat.length()) {
            if(i >= txt.length() || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i + 1;
        }

        return true;
    }

}

