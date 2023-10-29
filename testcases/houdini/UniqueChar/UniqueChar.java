import java.util.HashMap;
import java.util.Map;


class UniqueChar {
    public static int firstUniqChar(String s) {
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

    public static void main(String[] args) {
        firstUniqChar("");
        firstUniqChar("a");
        firstUniqChar("aabb");
        firstUniqChar("ab");
        firstUniqChar("qabababc");
        firstUniqChar("dagvwhfejrk");
        firstUniqChar("eeeeer");
        firstUniqChar("114514");
    }
}