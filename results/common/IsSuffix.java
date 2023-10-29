public class IsSuffix {

    //@ requires (\forall int i; 0 <= i && i < pat.length(); (int)Character.MIN_VALUE <= (int)pat.charAt(i) && (int)pat.charAt(i) <= (int)Character.MAX_VALUE);
    //@ requires (\forall int i; 0 <= i && i < txt.length(); (int)Character.MIN_VALUE <= (int)txt.charAt(i) && (int)txt.charAt(i) <= (int)Character.MAX_VALUE);
 
    public boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;

        //@ maintaining 0 - 1 <= i && i < pat.length();  
        //@ maintaining (\forall int k; i+1 <= k && k < pat.length(); (\exists int j; 0 <= j && j < pat.length(); pat.charAt(j) == txt.charAt(txt.length() - pat.length() + j)));
        //@ decreases i;
        while(i >= 0) {
	    int j = i - pat.length() + txt.length();
            if(j < 0 || pat.charAt(i) != txt.charAt(j))
                return false;
            i = i - 1;
        }

        return true;
    }

}
