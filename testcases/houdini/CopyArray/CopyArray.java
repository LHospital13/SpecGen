public class CopyArray {
 
    public static void CopyArray(int[] b, int iBegin, int iEnd, int[] a) {
        int k = iBegin;

        while (iEnd - k > 0) {
            __Loop_Invariant_Dummy1(b, iBegin, iEnd, a, k);
            a[k] = b[k];
            k = k + 1 ;
        }
    }

    public static void __Loop_Invariant_Dummy1(int[] b, int iBegin, int iEnd, int[] a, int k) {}
}

