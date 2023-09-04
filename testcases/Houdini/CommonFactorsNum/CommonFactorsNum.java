class CommonFactorsNum {
    public int commonFactorsNum(int a, int b) {
        int ans = 0;

        for (int x = 1; x <= a && x <= b; ++x) {
            if (a % x == 0 && b % x == 0) {
                ++ans;
            }
        }
        
        return ans;
    }

    public void __HoudiniInvoker() {
        commonFactorsNum(-4, 0);
        commonFactorsNum(0, -4);
        commonFactorsNum(4, 0);
        commonFactorsNum(0, 4);
        commonFactorsNum(-4, -4);
        commonFactorsNum(4, 4);
        commonFactorsNum(0, 0);
        commonFactorsNum(-4, 4);
        commonFactorsNum(4, -4);
        commonFactorsNum(1, -1);
        commonFactorsNum(-1, 1);
        commonFactorsNum(3, 6);
    }
}