class IsPalindrome {
    //@ requires (\forall int i; 0 <= i && i < s.length(); (int)Character.MIN_VALUE <= (int)s.charAt(i) && (int)s.charAt(i) <= (int)Character.MAX_VALUE);
    //@ ensures \result <==> (\forall int i; 0 <= i && i < s.length(); s.charAt(i) == s.charAt(s.length() - 1 - i));
    public static boolean isPalindrome(String s) {
        int n = s.length();

        //@ maintaining 0 <= i && i <= s.length();
        //@ maintaining (\forall int j; 0 <= j && j < i; s.charAt(j) == s.charAt(n - 1 - j));
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}

