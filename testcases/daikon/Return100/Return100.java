public class Return100 {
    public static int return100 () {
        int res = 0;
        for(int i = 0; i < 100; i++) {
            __Loop_Invariant_Dummy1(res, i);
            res = res + 1;
        }
        return res;
    }

    public static void __Loop_Invariant_Dummy1(int res, int i) {}

    public static void main(String[] args) {
        return100();
    }
}
