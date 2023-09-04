class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] cnt = new int[26];
        for (char c : magazine.toCharArray()) {
            cnt[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            cnt[c - 'a']--;
            if(cnt[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public void __HoudiniInvoker() {
        canConstruct("abcde", "abcdefg");
        canConstruct("a", "abc");
        canConstruct("", "");
        canConstruct("a", "");
        canConstruct("", "ab");
    }
}
