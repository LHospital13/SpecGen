import java.util.HashSet;

class RepeatedChar {
    public char repeatedCharacter(String s) {
        HashSet<Character> seen = new HashSet<Character>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!seen.add(ch)) {
                return ch;
            }
        }
        // impossible
        return ' ';
    }

    public void __HoudiniInvoker() {
        repeatedCharacter("a");
        repeatedCharacter("b");
        repeatedCharacter("aabb");
        repeatedCharacter("abab");
        repeatedCharacter("");
    }
}