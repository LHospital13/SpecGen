class CanConstruct {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] cnt = new int[26];
        for (char c : magazine.toCharArray()) {
            __Loop_Invariant_Dummy1(ransomNote, magazine, cnt);
            cnt[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            __Loop_Invariant_Dummy2(ransomNote, magazine, cnt);
            cnt[c - 'a']--;
            if(cnt[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void __Loop_Invariant_Dummy1(String rn, String m, int[] cnt) {}

    public static void __Loop_Invariant_Dummy2(String rn, String m, int[] cnt) {}

    public static void main(String[] args) {
        canConstruct("abcde", "abcdefg");
        canConstruct("a", "abc");
        canConstruct("", "");
        canConstruct("a", "");
        canConstruct("", "ab");
        canConstruct("awvdgjhbfeknjg", "porijfuhbjndskmle");
        canConstruct("ldkefjr", "kfjruhyegs");
        canConstruct("aaaaabbba", "aaaaaaaaabbbbbbbbb");
    }
}
