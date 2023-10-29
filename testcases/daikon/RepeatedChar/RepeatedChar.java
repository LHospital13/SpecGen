import java.util.HashSet;

class RepeatedChar {
    public static char repeatedCharacter(String s) {
        HashSet<Character> seen = new HashSet<Character>();
        
        for (int i = 0; i < s.length(); i++) {
            __Loop_Invariant_Dummy1(s, seen, i);
            char ch = s.charAt(i);
            if (!seen.add(ch)) {
                return ch;
            }
        }
        // impossible
        return ' ';
    }

    public static void __Loop_Invariant_Dummy1(String s, HashSet<Character> seen, int i) {}
    public static void main(String[] args) {
        repeatedCharacter("");
        repeatedCharacter("a");
        repeatedCharacter("aabb");
        repeatedCharacter("ab");
        repeatedCharacter("qabababc");
        repeatedCharacter("dagvwhfejrk");
        repeatedCharacter("eeeeer");
        repeatedCharacter("114514");
    }
}