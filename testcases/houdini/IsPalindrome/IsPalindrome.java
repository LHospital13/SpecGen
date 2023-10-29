class IsPalindrome {
    public static boolean isPalindrome(String s) {
        int n = s.length();

        for(int i = 0; i < s.length(); i++) {
            __Loop_Invariant_Dummy1(s, n, i);
            if(s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void __Loop_Invariant_Dummy1(String s, int n, int i){}

    /*@ requires args != null; */
    /*@ requires \typeof(args) == \type(java.lang.String[]); */
    /*@ requires (args.length == 0) && ((\forall int i; (0 <= i && i <= args.length-1) ==> (args[i] != null))); */
    /*@ ensures (args.length == 0) && ((\forall int i; (0 <= i && i <= args.length-1) ==> (args[i] != null))); */
    public static void main(String[] args) {
        isPalindrome("");
        isPalindrome("a");
        isPalindrome("aabb");
        isPalindrome("ab");
        isPalindrome("114514");
        isPalindrome("qabbaq");
        isPalindrome("dagvwwvgad");
        isPalindrome("114514415411");
    }
}
