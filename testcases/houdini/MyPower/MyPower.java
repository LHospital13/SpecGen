class MyPower {
    public static int power(int x, int n) {
        int res = 1;
        for(int i = 0; i < n; i++) {
            __Loop_Invariant_Dummy1(x, n, res, i);
	        res = res * x;
        }
        return res;
    }

    public static void __Loop_Invariant_Dummy1(int x, int n, int res, int i) {}

    void __HoudiniInvoker() {
        power(1, 1);
        power(1, 2);
        power(2, 0);
    }
}
