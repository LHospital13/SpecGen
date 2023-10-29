import java.util.HashSet;
import java.util.Set;

class RepeatedChar {
    //@ requires (\forall int i; 0 <= i && i < s.length(); (int)Character.MIN_VALUE <= (int)s.charAt(i) && (int)s.charAt(i) <= (int)Character.MAX_VALUE);
    //@ ensures \result == ' ' || (\exists int i; 0 <= i && i < s.length(); s.charAt(i) == \result && (\forall int j; 0 <= j && j < i; s.charAt(j) != s.charAt(i)));
    public char repeatedCharacter(String s) {
        Set<Character> seen = new HashSet<Character>();
        
 
        //@ decreases s.length() - i;
        for (int i = 0; i < s.length(); i++) {
            if (!seen.add(s.charAt(i))) {
                return s.charAt(i);
            }
        }
        // impossible
        return ' ';
    }
}
