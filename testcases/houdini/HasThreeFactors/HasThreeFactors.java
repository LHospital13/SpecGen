class HasThreeFactors {
    public boolean hasThreeFactors(int n) {
        if (n == 0) return true;
        if (n >= 1 && n <= 2) return false;
        
        for(int i = 2; i < n; i++) {
            __Loop_Invariant_Dummy1(n, i);
            if (n % i == 0) {
                if (i * i != n) return false;
                else return true;
            }
        }
        return false;
    }

    public static void __Loop_Invariant_Dummy1(int n, int i);
}