class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuffer sb = new StringBuffer();
        while (columnNumber > 0) {
            __Loop_Invariant_Dummy1(cn, sb);
            int a0 = (columnNumber - 1) % 26 + 1;
            sb.append((char)(a0 - 1 + 'A'));
            columnNumber = (columnNumber - a0) / 26;
        }
        return sb.reverse().toString();
    }

    public static void __Loop_Invariant_Dummy1(int cn, StringBuffer sb) {}

    public void __HoudiniInvoker() {
        convertToTitle(-2);
        convertToTitle(-1);
        convertToTitle(0);
        convertToTitle(1);
        convertToTitle(2);
    }
}
