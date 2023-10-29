class CheckABeforeB {
    //@ ensures \result ==> (\exists int i; 0 < i && i < s.length(); s.charAt(i) == 'a') || (\forall int j; s.length() < j && j < s.length(); s.charAt(j) == 'b');  
    public boolean checkString(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        //@ maintaining 0 <= i && i <= chars.length && (\forall int k; 0 <= k && k < i; chars[k] == 'a');
        //@ decreases chars.length - i;
        while (i < chars.length && chars[i] == 'a') {
            i++;
        }
        int j = i;
        //@ maintaining i <= j && j <= chars.length && (\forall int k; i <= k && k < j; chars[k] == 'b');
        //@ decreases chars.length - j;
        while (j < chars.length && chars[j] == 'b') {
            j++;
        }
        return j == chars.length;
    }
}
