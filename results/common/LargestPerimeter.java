class LargestPerimeter {
    //@ requires A != null;
    //@ ensures \result >= 0;
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        //@ maintaining 0 - 1 <= i && i <= A.length - 1;  
        //@ maintaining (\forall int j; i+2 <= j && j < A.length; A[j-2] + A[j-1] <= A[j]);
        //@ decreases i;
        for (int i = A.length - 1; i >= 2; --i) {
            if (A[i - 2] + A[i - 1] > A[i]) {
                return A[i - 2] + A[i - 1] + A[i];
            }
        }
        return 0;
    }
}
