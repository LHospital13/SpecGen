class MyPower {
    public static double power(double x, int n) {
        double res = 1.0;
        for(int i = 0; i < n; i++)
	        res = res * x;
        return res;
    }

    void __HoudiniInvoker() {
        power(1.0, 1);
        power(1.0, 2);
        power(2.0, 0);
    }
}
