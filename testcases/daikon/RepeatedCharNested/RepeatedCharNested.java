public class RepeatedCharNested {

    public static int repeatedCharacter(String s) {
        for (int i = 0; i < s.length(); ++i) {
            __Loop_Invariant_Dummy1(s, i);
            char c1 = s.charAt(i);
            for (int j = i + 1; j < s.length(); ++j) {
                __Loop_Invariant_Dummy2(s, i, c1, j);
                char c2 = s.charAt(j);
                if(c1 == c2)
                    return i;
            }
        }
        return -1;
    }

    public static void __Loop_Invariant_Dummy1(String s, int i) {}

    public static void __Loop_Invariant_Dummy2(String s, int i, char c1, int j) {}
    public static void main(String[] args) {
        repeatedCharacter("");
        repeatedCharacter("a");
        repeatedCharacter("aabb");
        repeatedCharacter("ab");
        repeatedCharacter("qabababc");
        repeatedCharacter("dagvwhfejrk");
        repeatedCharacter("dagvwhfejrkv");
        repeatedCharacter("eeeeer");
        repeatedCharacter("114514");
    }
    
}