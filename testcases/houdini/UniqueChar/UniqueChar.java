import java.util.HashMap;

class UniqueChar {
    public int firstUniqChar(String s) {
        Map<Character, Integer> frequency = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); ++i) {
            __Loop_Invariant_Dummy1(s, frequency, i);
            char ch = s.charAt(i);
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); ++i) {
            __Loop_Invariant_Dummy2(s, frequency, i);
            if (frequency.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void __Loop_Invariant_Dummy1(String s, Map<Character, Integer> frequency, int i) {}

    public static void __Loop_Invariant_Dummy2(String s, Map<Character, Integer> frequency, int i) {}
}