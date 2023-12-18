class IsAllUnique {
    public static boolean isAllUnique(String str) {
        int len = str.length();
        if (len > 26) {
            return false;
        }
        int num = 0;
        int i = 0;
        for (i = 0; i < len; i++) {
            __Loop_Invariant_Dummy1(str, len, num, i);
            char c = str.charAt(i);
            int index = c - 'a';
            if ((num & (1 << index)) != 0) {
                return false;
            } else {
                num |= (1 << index);
            }
        }
        __Loop_Invariant_Dummy1(str, len, num, i);
        return true;
    }

    public static void __Loop_Invariant_Dummy1 (String str, int len, int num, int i) {}
    
    public static void main(String[] args) {
        isAllUnique("");
        isAllUnique("a");
        isAllUnique("aabb");
        isAllUnique("ab");
        isAllUnique("qabababc");
        isAllUnique("dagvwhfejrk");
    }
}