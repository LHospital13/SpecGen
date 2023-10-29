import java.util.HashSet;

class RepeatedChar {
    public char repeatedCharacter(String s) {
        HashSet<Character> seen = new HashSet<Character>();
        
        for (int i = 0; i < s.length(); i++) {
            __Loop_Invariant_Dummy1(s, seenn, i);
            char ch = s.charAt(i);
            if (!seen.add(ch)) {
                return ch;
            }
        }
        // impossible
        return ' ';
    }

    public static void __Loop_Invariant_Dummy1(String s, HashSet<Character> seen, int i) {}

    public void __HoudiniInvoker() {
        repeatedCharacter("a");
        repeatedCharacter("b");
        repeatedCharacter("aabb");
        repeatedCharacter("abab");
        repeatedCharacter("");
    }
}