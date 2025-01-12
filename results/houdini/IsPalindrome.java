class IsPalindrome {
    //@ ensures s == null ==> \result;
    //@ ensures s == null ==> !\result;
    public static boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0;
        for(i = 0; i < s.length(); i++) {
            __Loop_Invariant_Dummy1(s, n, i);
            if(s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        __Loop_Invariant_Dummy1(s, n, i);

        return true;
    }

    //@ requires n >= 0;
    //@ requires n != -1;
    //@ requires n >= -1;
    //@ requires n > -1;
    public static void __Loop_Invariant_Dummy1(String s, int n, int i){}

    /*@ requires args != null; */
    /*@ requires \typeof(args) == \type(java.lang.String[]); */
    /*@ requires (args.length == 0) && ((\forall int i; (0 <= i && i <= args.length-1) ==> (args[i] != null))); */
    /*@ ensures (args.length == 0) && ((\forall int i; (0 <= i && i <= args.length-1) ==> (args[i] != null))); */
    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isPalindrome("");
        isPalindrome("a");
        isPalindrome("aabb");
	isPalindrome("abba");
        isPalindrome("ab");
        isPalindrome("cc");
        isPalindrome("114514");
        isPalindrome("qabbaq");
        isPalindrome("dagvwwvgad");
        isPalindrome("114514415411");
    }
}
