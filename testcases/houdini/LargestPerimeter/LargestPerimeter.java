import java.util.Arrays;

class LargestPerimeter {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; --i) {
            __Loop_Invariant_Dummy1(A, i);
            if (A[i - 2] + A[i - 1] > A[i]) {
                return A[i - 2] + A[i - 1] + A[i];
            }
        }
        return 0;
    }

    public static void __Loop_Invariant_Dummy1(int[] A, int i) {}
}
