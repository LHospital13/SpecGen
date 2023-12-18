class JewelsInStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int jewelsCount = 0;
        int jewelsLength = jewels.length(), stonesLength = stones.length();
        int i = 0;
        for (i = 0; i < stonesLength; i++) {
            __Loop_Invariant_Dummy1(jewels, stones, jewelsCount, jewelsLength, stonesLength, i);
            char stone = stones.charAt(i);
            int j = 0;
            for (j = 0; j < jewelsLength; j++) {
                __Loop_Invariant_Dummy2(jewels, stones, jewelsCount, jewelsLength, stonesLength, i, stone, j);
                char jewel = jewels.charAt(j);
                if (stone == jewel) {
                    jewelsCount++;
                    break;
                }
            }
            __Loop_Invariant_Dummy2(jewels, stones, jewelsCount, jewelsLength, stonesLength, i, stone, j);
        }
        __Loop_Invariant_Dummy1(jewels, stones, jewelsCount, jewelsLength, stonesLength, i);
        return jewelsCount;
    }

    public static void __Loop_Invariant_Dummy1(String jewels, String stones, int jewelsCount, int jewelsLength, int stonesLength, int i) {}

    public static void __Loop_Invariant_Dummy2(String jewels, String stones, int jewelsCount, int jewelsLength, int stonesLength, int i, char stone, int j) {}

    public static void main(String[] args) {
        numJewelsInStones("abcde", "abcdefg");
        numJewelsInStones("a", "abc");
        numJewelsInStones("", "");
        numJewelsInStones("a", "");
        numJewelsInStones("", "ab");
        numJewelsInStones("114", "514");
        numJewelsInStones("114", "114514");
        numJewelsInStones("114514", "1141919514810");
    }
}