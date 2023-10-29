class IsAllUnique {
    //@ requires (\forall int i; 0 <= i && i < str.length(); (int)Character.MIN_VALUE <= (int)str.charAt(i) && (int)str.charAt(i) <= (int)Character.MAX_VALUE);
    //@ ensures \result <==> (\forall int i, j; 0 < i && i < str.length() && 0 < j && j <= str.length() && i != j; str.charAt(i) != str.charAt(j));  
    boolean isAllUnique(String str) {
        int len = str.length();
        //@ assert 0 <= len && len <= Integer.MAX_VALUE;
        if (len > 26) {
            return false;
        }
        int num = 0;
        //@ maintaining 0 <= i && i <= len;
        //@ maintaining (\forall int k; 0 <= k && k < i; (num & (1 << (str.charAt(k) - 'a'))) == 0);
        //@ decreases len - i;
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            int index = c - 'a';
            if ((num & (1 << index)) != 0) {
                return false;
            } else {
                num |= (1 << index);
            }
        }
        return true;
    }
}

