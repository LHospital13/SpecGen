class ConvertToTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuffer sb = new StringBuffer();
        while (columnNumber > 0) {
            __Loop_Invariant_Dummy1(columnNumber, sb);
            int a0 = (columnNumber - 1) % 26 + 1;
            sb.append((char)(a0 - 1 + 'A'));
            columnNumber = (columnNumber - a0) / 26;
        }
        __Loop_Invariant_Dummy1(columnNumber, sb);
        return sb.reverse().toString();
    }

    public static void __Loop_Invariant_Dummy1(int cn, StringBuffer sb) {}

    public static void main(String[] args) {
        convertToTitle(-2);
        convertToTitle(-1);
        convertToTitle(0);
        convertToTitle(1);
        convertToTitle(2);
        convertToTitle(3);
        convertToTitle(4);
        convertToTitle(5);
        convertToTitle(114);
        convertToTitle(514);
        convertToTitle(1919);
        convertToTitle(810);
    }
}
