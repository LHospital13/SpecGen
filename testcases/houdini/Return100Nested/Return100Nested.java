public class Return100Nested {
    public static int return100 () {
        int res = 0;
        for(int i = 0; i < 10; i++) {
            __Loop_Invariant_Dummy1(res, i);
            for(int j = 0; j < 10; j++) {
                __Loop_Invariant_Dummy2(res, i, j);
                res = res + 1;
            }
        }
        return res;
    }

    public static void __Loop_Invariant_Dummy1(int res, int i) {}

    public static void __Loop_Invariant_Dummy2(int res, int i, int j) {}

    public static void main(String[] args) {
        return100();
    }
}
