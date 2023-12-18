public class UniqueCharNested {

    public static int uniqueChar(String s) {
        for (int i = 0; i < s.length(); ++i) {
            __Loop_Invariant_Dummy1(s, i);
            int j = 0;
            while(j < s.length()) {
                __Loop_Invariant_Dummy2(s, i, j);
                if(i != j && s.charAt(i) == s.charAt(j))
                    break;
                j++;
            }
            if(j == s.length())
                return i;
        }
        return -1;
    }

    public static void __Loop_Invariant_Dummy1(String s, int i) {}

    public static void __Loop_Invariant_Dummy2(String s, int i, int j) {}

    public static void main(String[] args) {
        uniqueChar("");
        uniqueChar("a");
        uniqueChar("aabb");
        uniqueChar("ab");
        uniqueChar("qabababc");
        uniqueChar("dagvwhfejrk");
        uniqueChar("dagvwhfejrkv");
        uniqueChar("eeeeer");
        uniqueChar("114514");
    }
    
}