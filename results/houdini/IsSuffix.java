public class IsSuffix {

    //@ */ throws java.lang.StringIndexOutOfBoundsException /* Houdini inferred exceptions
    //@ non_null
    //@ non_null
    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ non_null
    //@ non_null
    //@ requires i < 1;
    //@ requires i <= 1;
    //@ requires i == 1;
    //@ requires i != 1;
    //@ requires i >= 1;
    //@ requires i > 1;
    //@ requires i < 0;
    //@ requires i <= 0;
    //@ requires i == 0;
    //@ requires i != 0;
    //@ requires i >= 0;
    //@ requires i > 0;
    //@ requires i < -1;
    //@ requires i <= -1;
    //@ requires i == -1;
    //@ requires i != -1;
    //@ requires i >= -1;
    //@ requires i > -1;
    //@ requires j < i;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ */ throws java.lang.StringIndexOutOfBoundsException /* Houdini inferred exceptions
    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:3: error: illegal start of type
    //@ */ throws java.lang.StringIndexOutOfBoundsException /* Houdini inferred exceptions
        ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:3: error: Embedded block comment must terminate within the JML line comment
    //@ */ throws java.lang.StringIndexOutOfBoundsException /* Houdini inferred exceptions
                                                            ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:4: error: illegal start of type
    //@ non_null
        ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:6: error: ';' expected
    //@ ensures \result;
               ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:6: error: Token \result is not a type
    //@ ensures \result;
                ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:34: error: No modifiers are allowed prior to a lightweight specification case
    //@ non_null
        ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:80: error: illegal start of type
    //@ */ throws java.lang.StringIndexOutOfBoundsException /* Houdini inferred exceptions
        ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:80: error: unclosed comment
    //@ */ throws java.lang.StringIndexOutOfBoundsException /* Houdini inferred exceptions
                                                            ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:96: error: reached end of file while parsing
9 errors

public class IsSuffix {

    //@ non_null
    //@ non_null
    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ non_null
    //@ non_null
    //@ requires i < 1;
    //@ requires i <= 1;
    //@ requires i == 1;
    //@ requires i != 1;
    //@ requires i >= 1;
    //@ requires i > 1;
    //@ requires i < 0;
    //@ requires i <= 0;
    //@ requires i == 0;
    //@ requires i != 0;
    //@ requires i >= 0;
    //@ requires i > 0;
    //@ requires i < -1;
    //@ requires i <= -1;
    //@ requires i == -1;
    //@ requires i != -1;
    //@ requires i >= -1;
    //@ requires i > -1;
    //@ requires j < i;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ */ throws java.lang.StringIndexOutOfBoundsException /* Houdini inferred exceptions
    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:3: error: No modifiers are allowed prior to a lightweight specification case
    //@ non_null
        ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:33: error: No modifiers are allowed prior to a lightweight specification case
    //@ non_null
        ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:79: error: illegal start of type
    //@ */ throws java.lang.StringIndexOutOfBoundsException /* Houdini inferred exceptions
        ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:79: error: unclosed comment
    //@ */ throws java.lang.StringIndexOutOfBoundsException /* Houdini inferred exceptions
                                                            ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:95: error: reached end of file while parsing
5 errors

public class IsSuffix {

    //@ non_null
    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ non_null
    //@ non_null
    //@ requires i < 1;
    //@ requires i <= 1;
    //@ requires i == 1;
    //@ requires i != 1;
    //@ requires i >= 1;
    //@ requires i > 1;
    //@ requires i < 0;
    //@ requires i <= 0;
    //@ requires i == 0;
    //@ requires i != 0;
    //@ requires i >= 0;
    //@ requires i > 0;
    //@ requires i < -1;
    //@ requires i <= -1;
    //@ requires i == -1;
    //@ requires i != -1;
    //@ requires i >= -1;
    //@ requires i > -1;
    //@ requires j < i;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ */ throws java.lang.StringIndexOutOfBoundsException /* Houdini inferred exceptions
    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:3: error: No modifiers are allowed prior to a lightweight specification case
    //@ non_null
        ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:32: error: No modifiers are allowed prior to a lightweight specification case
    //@ non_null
        ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:78: error: illegal start of type
    //@ */ throws java.lang.StringIndexOutOfBoundsException /* Houdini inferred exceptions
        ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:78: error: unclosed comment
    //@ */ throws java.lang.StringIndexOutOfBoundsException /* Houdini inferred exceptions
                                                            ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:94: error: reached end of file while parsing
5 errors

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ non_null
    //@ non_null
    //@ requires i < 1;
    //@ requires i <= 1;
    //@ requires i == 1;
    //@ requires i != 1;
    //@ requires i >= 1;
    //@ requires i > 1;
    //@ requires i < 0;
    //@ requires i <= 0;
    //@ requires i == 0;
    //@ requires i != 0;
    //@ requires i >= 0;
    //@ requires i > 0;
    //@ requires i < -1;
    //@ requires i <= -1;
    //@ requires i == -1;
    //@ requires i != -1;
    //@ requires i >= -1;
    //@ requires i > -1;
    //@ requires j < i;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ */ throws java.lang.StringIndexOutOfBoundsException /* Houdini inferred exceptions
    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:31: error: No modifiers are allowed prior to a lightweight specification case
    //@ non_null
        ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:77: error: illegal start of type
    //@ */ throws java.lang.StringIndexOutOfBoundsException /* Houdini inferred exceptions
        ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:77: error: unclosed comment
    //@ */ throws java.lang.StringIndexOutOfBoundsException /* Houdini inferred exceptions
                                                            ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:93: error: reached end of file while parsing
4 errors

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ non_null
    //@ requires i < 1;
    //@ requires i <= 1;
    //@ requires i == 1;
    //@ requires i != 1;
    //@ requires i >= 1;
    //@ requires i > 1;
    //@ requires i < 0;
    //@ requires i <= 0;
    //@ requires i == 0;
    //@ requires i != 0;
    //@ requires i >= 0;
    //@ requires i > 0;
    //@ requires i < -1;
    //@ requires i <= -1;
    //@ requires i == -1;
    //@ requires i != -1;
    //@ requires i >= -1;
    //@ requires i > -1;
    //@ requires j < i;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ */ throws java.lang.StringIndexOutOfBoundsException /* Houdini inferred exceptions
    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:31: error: No modifiers are allowed prior to a lightweight specification case
    //@ non_null
        ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:76: error: illegal start of type
    //@ */ throws java.lang.StringIndexOutOfBoundsException /* Houdini inferred exceptions
        ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:76: error: unclosed comment
    //@ */ throws java.lang.StringIndexOutOfBoundsException /* Houdini inferred exceptions
                                                            ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:92: error: reached end of file while parsing
4 errors

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires i < 1;
    //@ requires i <= 1;
    //@ requires i == 1;
    //@ requires i != 1;
    //@ requires i >= 1;
    //@ requires i > 1;
    //@ requires i < 0;
    //@ requires i <= 0;
    //@ requires i == 0;
    //@ requires i != 0;
    //@ requires i >= 0;
    //@ requires i > 0;
    //@ requires i < -1;
    //@ requires i <= -1;
    //@ requires i == -1;
    //@ requires i != -1;
    //@ requires i >= -1;
    //@ requires i > -1;
    //@ requires j < i;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ */ throws java.lang.StringIndexOutOfBoundsException /* Houdini inferred exceptions
    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:75: error: illegal start of type
    //@ */ throws java.lang.StringIndexOutOfBoundsException /* Houdini inferred exceptions
        ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:75: error: unclosed comment
    //@ */ throws java.lang.StringIndexOutOfBoundsException /* Houdini inferred exceptions
                                                            ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:91: error: reached end of file while parsing
3 errors

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires i < 1;
    //@ requires i <= 1;
    //@ requires i == 1;
    //@ requires i != 1;
    //@ requires i >= 1;
    //@ requires i > 1;
    //@ requires i < 0;
    //@ requires i <= 0;
    //@ requires i == 0;
    //@ requires i != 0;
    //@ requires i >= 0;
    //@ requires i > 0;
    //@ requires i < -1;
    //@ requires i <= -1;
    //@ requires i == -1;
    //@ requires i != -1;
    //@ requires i >= -1;
    //@ requires i > -1;
    //@ requires j < i;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:26: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:73:) in method isSuffix
        __Loop_Invariant_Dummy1(pat, txt, i, j);
                               ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:73: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:26:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:33: verify: Precondition conjunct is false: i == 1
    //@ requires i == 1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires i < 1;
    //@ requires i <= 1;
    //@ requires i != 1;
    //@ requires i >= 1;
    //@ requires i > 1;
    //@ requires i < 0;
    //@ requires i <= 0;
    //@ requires i == 0;
    //@ requires i != 0;
    //@ requires i >= 0;
    //@ requires i > 0;
    //@ requires i < -1;
    //@ requires i <= -1;
    //@ requires i == -1;
    //@ requires i != -1;
    //@ requires i >= -1;
    //@ requires i > -1;
    //@ requires j < i;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:26: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:72:) in method isSuffix
        __Loop_Invariant_Dummy1(pat, txt, i, j);
                               ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:72: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:26:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:34: verify: Precondition conjunct is false: i >= 1
    //@ requires i >= 1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires i < 1;
    //@ requires i <= 1;
    //@ requires i != 1;
    //@ requires i > 1;
    //@ requires i < 0;
    //@ requires i <= 0;
    //@ requires i == 0;
    //@ requires i != 0;
    //@ requires i >= 0;
    //@ requires i > 0;
    //@ requires i < -1;
    //@ requires i <= -1;
    //@ requires i == -1;
    //@ requires i != -1;
    //@ requires i >= -1;
    //@ requires i > -1;
    //@ requires j < i;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:26: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:71:) in method isSuffix
        __Loop_Invariant_Dummy1(pat, txt, i, j);
                               ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:71: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:26:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:34: verify: Precondition conjunct is false: i > 1
    //@ requires i > 1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires i < 1;
    //@ requires i <= 1;
    //@ requires i != 1;
    //@ requires i < 0;
    //@ requires i <= 0;
    //@ requires i == 0;
    //@ requires i != 0;
    //@ requires i >= 0;
    //@ requires i > 0;
    //@ requires i < -1;
    //@ requires i <= -1;
    //@ requires i == -1;
    //@ requires i != -1;
    //@ requires i >= -1;
    //@ requires i > -1;
    //@ requires j < i;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:26: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:70:) in method isSuffix
        __Loop_Invariant_Dummy1(pat, txt, i, j);
                               ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:70: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:26:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:36: verify: Precondition conjunct is false: i == 0
    //@ requires i == 0;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires i < 1;
    //@ requires i <= 1;
    //@ requires i != 1;
    //@ requires i < 0;
    //@ requires i <= 0;
    //@ requires i != 0;
    //@ requires i >= 0;
    //@ requires i > 0;
    //@ requires i < -1;
    //@ requires i <= -1;
    //@ requires i == -1;
    //@ requires i != -1;
    //@ requires i >= -1;
    //@ requires i > -1;
    //@ requires j < i;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:26: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:69:) in method isSuffix
        __Loop_Invariant_Dummy1(pat, txt, i, j);
                               ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:69: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:26:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:37: verify: Precondition conjunct is false: i >= 0
    //@ requires i >= 0;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires i < 1;
    //@ requires i <= 1;
    //@ requires i != 1;
    //@ requires i < 0;
    //@ requires i <= 0;
    //@ requires i != 0;
    //@ requires i > 0;
    //@ requires i < -1;
    //@ requires i <= -1;
    //@ requires i == -1;
    //@ requires i != -1;
    //@ requires i >= -1;
    //@ requires i > -1;
    //@ requires j < i;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:26: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:68:) in method isSuffix
        __Loop_Invariant_Dummy1(pat, txt, i, j);
                               ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:68: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:26:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:37: verify: Precondition conjunct is false: i > 0
    //@ requires i > 0;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires i < 1;
    //@ requires i <= 1;
    //@ requires i != 1;
    //@ requires i < 0;
    //@ requires i <= 0;
    //@ requires i != 0;
    //@ requires i < -1;
    //@ requires i <= -1;
    //@ requires i == -1;
    //@ requires i != -1;
    //@ requires i >= -1;
    //@ requires i > -1;
    //@ requires j < i;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:26: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:67:) in method isSuffix
        __Loop_Invariant_Dummy1(pat, txt, i, j);
                               ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:67: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:26:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:39: verify: Precondition conjunct is false: i == -1
    //@ requires i == -1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires i < 1;
    //@ requires i <= 1;
    //@ requires i != 1;
    //@ requires i < 0;
    //@ requires i <= 0;
    //@ requires i != 0;
    //@ requires i < -1;
    //@ requires i <= -1;
    //@ requires i != -1;
    //@ requires i >= -1;
    //@ requires i > -1;
    //@ requires j < i;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:26: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:66:) in method isSuffix
        __Loop_Invariant_Dummy1(pat, txt, i, j);
                               ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:66: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:26:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:37: verify: Precondition conjunct is false: i < -1
    //@ requires i < -1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires i < 1;
    //@ requires i <= 1;
    //@ requires i != 1;
    //@ requires i < 0;
    //@ requires i <= 0;
    //@ requires i != 0;
    //@ requires i <= -1;
    //@ requires i != -1;
    //@ requires i >= -1;
    //@ requires i > -1;
    //@ requires j < i;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:26: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:65:) in method isSuffix
        __Loop_Invariant_Dummy1(pat, txt, i, j);
                               ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:65: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:26:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:38: verify: Precondition conjunct is false: i != -1
    //@ requires i != -1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires i < 1;
    //@ requires i <= 1;
    //@ requires i != 1;
    //@ requires i < 0;
    //@ requires i <= 0;
    //@ requires i != 0;
    //@ requires i <= -1;
    //@ requires i >= -1;
    //@ requires i > -1;
    //@ requires j < i;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:26: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:64:) in method isSuffix
        __Loop_Invariant_Dummy1(pat, txt, i, j);
                               ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:64: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:26:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:38: verify: Precondition conjunct is false: i >= -1
    //@ requires i >= -1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires i < 1;
    //@ requires i <= 1;
    //@ requires i != 1;
    //@ requires i < 0;
    //@ requires i <= 0;
    //@ requires i != 0;
    //@ requires i <= -1;
    //@ requires i > -1;
    //@ requires j < i;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:26: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:63:) in method isSuffix
        __Loop_Invariant_Dummy1(pat, txt, i, j);
                               ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:63: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:26:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:38: verify: Precondition conjunct is false: i > -1
    //@ requires i > -1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires i < 1;
    //@ requires i <= 1;
    //@ requires i != 1;
    //@ requires i < 0;
    //@ requires i <= 0;
    //@ requires i != 0;
    //@ requires i <= -1;
    //@ requires j < i;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:62:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:62: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:34: verify: Precondition conjunct is false: i < 0
    //@ requires i < 0;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires i < 1;
    //@ requires i <= 1;
    //@ requires i != 1;
    //@ requires i <= 0;
    //@ requires i != 0;
    //@ requires i <= -1;
    //@ requires j < i;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:61:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:61: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:35: verify: Precondition conjunct is false: i != 0
    //@ requires i != 0;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires i < 1;
    //@ requires i <= 1;
    //@ requires i != 1;
    //@ requires i <= 0;
    //@ requires i <= -1;
    //@ requires j < i;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:26: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:60:) in method isSuffix
        __Loop_Invariant_Dummy1(pat, txt, i, j);
                               ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:60: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:26:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:36: verify: Precondition conjunct is false: j < i
    //@ requires j < i;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires i < 1;
    //@ requires i <= 1;
    //@ requires i != 1;
    //@ requires i <= 0;
    //@ requires i <= -1;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:59:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:59: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:31: verify: Precondition conjunct is false: i < 1
    //@ requires i < 1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires i <= 1;
    //@ requires i != 1;
    //@ requires i <= 0;
    //@ requires i <= -1;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:58:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:58: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:32: verify: Precondition conjunct is false: i != 1
    //@ requires i != 1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires i <= 1;
    //@ requires i <= 0;
    //@ requires i <= -1;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:57:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:57: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:31: verify: Precondition conjunct is false: i <= 1
    //@ requires i <= 1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires i <= 0;
    //@ requires i <= -1;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:56:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:56: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:31: verify: Precondition conjunct is false: i <= 0
    //@ requires i <= 0;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires i <= -1;
    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:55:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:55: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:31: verify: Precondition conjunct is false: i <= -1
    //@ requires i <= -1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j != i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:26: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:54:) in method isSuffix
        __Loop_Invariant_Dummy1(pat, txt, i, j);
                               ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:54: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:26:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:33: verify: Precondition conjunct is false: j != i
    //@ requires j != i;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j <= i;
    //@ requires j == i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:53:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:53: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:32: verify: Precondition conjunct is false: j == i
    //@ requires j == i;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j <= i;
    //@ requires j >= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:52:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:52: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:32: verify: Precondition conjunct is false: j >= i
    //@ requires j >= i;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j <= i;
    //@ requires j > i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:51:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:51: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:32: verify: Precondition conjunct is false: j > i
    //@ requires j > i;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j <= i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j == 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:50:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:50: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:34: verify: Precondition conjunct is false: j == 1
    //@ requires j == 1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j <= i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j != 1;
    //@ requires j >= 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:49:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:49: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:35: verify: Precondition conjunct is false: j >= 1
    //@ requires j >= 1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j <= i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j != 1;
    //@ requires j > 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:48:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:48: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:35: verify: Precondition conjunct is false: j > 1
    //@ requires j > 1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j <= i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j != 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j == 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:47:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:47: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:37: verify: Precondition conjunct is false: j == 0
    //@ requires j == 0;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j <= i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j != 1;
    //@ requires j < 0;
    //@ requires j <= 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:46:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:46: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:35: verify: Precondition conjunct is false: j < 0
    //@ requires j < 0;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j <= i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j != 1;
    //@ requires j <= 0;
    //@ requires j != 0;
    //@ requires j >= 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:45:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:45: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:37: verify: Precondition conjunct is false: j >= 0
    //@ requires j >= 0;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j <= i;
    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j != 1;
    //@ requires j <= 0;
    //@ requires j != 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:26: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:44:) in method isSuffix
        __Loop_Invariant_Dummy1(pat, txt, i, j);
                               ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:44: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:26:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:31: verify: Precondition conjunct is false: j <= i
    //@ requires j <= i;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j != 1;
    //@ requires j <= 0;
    //@ requires j != 0;
    //@ requires j > 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:26: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:43:) in method isSuffix
        __Loop_Invariant_Dummy1(pat, txt, i, j);
                               ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:43: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:26:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:36: verify: Precondition conjunct is false: j > 0
    //@ requires j > 0;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j != 1;
    //@ requires j <= 0;
    //@ requires j != 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:42:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:42: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:35: verify: Precondition conjunct is false: j != 0
    //@ requires j != 0;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j != 1;
    //@ requires j <= 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j == -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:41:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:41: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:37: verify: Precondition conjunct is false: j == -1
    //@ requires j == -1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j != 1;
    //@ requires j <= 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j != -1;
    //@ requires j >= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:40:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:40: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:38: verify: Precondition conjunct is false: j >= -1
    //@ requires j >= -1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j != 1;
    //@ requires j <= 0;
    //@ requires j < -1;
    //@ requires j <= -1;
    //@ requires j != -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:39:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:39: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:35: verify: Precondition conjunct is false: j < -1
    //@ requires j < -1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j != 1;
    //@ requires j <= 0;
    //@ requires j <= -1;
    //@ requires j != -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:26: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:38:) in method isSuffix
        __Loop_Invariant_Dummy1(pat, txt, i, j);
                               ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:38: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:26:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:36: verify: Precondition conjunct is false: j != -1
    //@ requires j != -1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j != 1;
    //@ requires j <= 0;
    //@ requires j <= -1;
    //@ requires j > -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:37:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:37: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:36: verify: Precondition conjunct is false: j > -1
    //@ requires j > -1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j < 1;
    //@ requires j <= 1;
    //@ requires j != 1;
    //@ requires j <= 0;
    //@ requires j <= -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:36:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:36: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:31: verify: Precondition conjunct is false: j < 1
    //@ requires j < 1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j <= 1;
    //@ requires j != 1;
    //@ requires j <= 0;
    //@ requires j <= -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:26: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:35:) in method isSuffix
        __Loop_Invariant_Dummy1(pat, txt, i, j);
                               ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:35: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:26:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:31: verify: Precondition conjunct is false: j <= 1
    //@ requires j <= 1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j != 1;
    //@ requires j <= 0;
    //@ requires j <= -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:26: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:34:) in method isSuffix
        __Loop_Invariant_Dummy1(pat, txt, i, j);
                               ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:34: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:26:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:31: verify: Precondition conjunct is false: j != 1
    //@ requires j != 1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j <= 0;
    //@ requires j <= -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:33:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:33: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:31: verify: Precondition conjunct is false: j <= 0
    //@ requires j <= 0;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    //@ requires j <= -1;
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:20: verify: The prover cannot establish an assertion (Precondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:32:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:32: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:20:
    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}
                       ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:31: verify: Precondition conjunct is false: j <= -1
    //@ requires j <= -1;
                   ^
3 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ ensures !\result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:28: verify: The prover cannot establish an assertion (Postcondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:4:) in method isSuffix
        return true;
        ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:4: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:28:
    //@ ensures !\result;
        ^
2 verification failures

public class IsSuffix {

    //@ ensures \result;
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:21: verify: The prover cannot establish an assertion (Postcondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:3:) in method isSuffix
                return false;
                ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:3: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:21:
    //@ ensures \result;
        ^
2 verification failures

public class IsSuffix {

    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:18: verify: The prover cannot establish an assertion (ExceptionalPostcondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:3:) in method isSuffix
            __Loop_Invariant_Dummy1(pat, txt, i, j);
                                   ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:3: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:18:
    //@ exsures (java.lang.StringIndexOutOfBoundsException ex) (false);
        ^
2 verification failures

public class IsSuffix {

    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> \result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:19: verify: The prover cannot establish an assertion (Postcondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:5:) in method isSuffix
                return false;
                ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:5: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:19:
    //@ ensures pat != null ==> \result;
        ^
2 verification failures

public class IsSuffix {

    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> \result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:18: verify: The prover cannot establish an assertion (Postcondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:8:) in method isSuffix
                return false;
                ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:8: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:18:
    //@ ensures txt != null ==> \result;
        ^
2 verification failures

public class IsSuffix {

    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures pat != null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:23: verify: The prover cannot establish an assertion (Postcondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:5:) in method isSuffix
        return true;
        ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:5: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:23:
    //@ ensures pat != null ==> !\result;
        ^
2 verification failures

public class IsSuffix {

    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    //@ ensures txt != null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}


/home/max/Documents/JMLGPT/tmp/IsSuffix.java:22: verify: The prover cannot establish an assertion (Postcondition: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:7:) in method isSuffix
        return true;
        ^
/home/max/Documents/JMLGPT/tmp/IsSuffix.java:7: verify: Associated declaration: /home/max/Documents/JMLGPT/tmp/IsSuffix.java:22:
    //@ ensures txt != null ==> !\result;
        ^
2 verification failures

public class IsSuffix {

    //@ ensures pat == null ==> \result;
    //@ ensures pat == null ==> !\result;
    //@ ensures txt == null ==> \result;
    //@ ensures txt == null ==> !\result;
    public static boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        int j = txt.length() - 1;

        while(i >= 0) {
            __Loop_Invariant_Dummy1(pat, txt, i, j);
            if(j < 0 || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i - 1;
            j = j - 1;
        }
        __Loop_Invariant_Dummy1(pat, txt, i, j);

        return true;
    }

    public static void __Loop_Invariant_Dummy1(String pat, String txt, int i, int j) {}

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        isSuffix("abcde", "abcdefg");
        isSuffix("a", "abc");
        isSuffix("", "");
        isSuffix("a", "");
        isSuffix("", "ab");
	isSuffix("114", "114");
        isSuffix("114", "514");
        isSuffix("114", "114514");
        isSuffix("114514", "1141919514810");
    }

}



