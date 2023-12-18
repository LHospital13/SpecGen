public class CopyArray {
 
    public static void copyArray(int[] b, int iBegin, int iEnd, int[] a) {
        int k = iBegin;

        while (iEnd - k > 0) {
            __Loop_Invariant_Dummy1(b, iBegin, iEnd, a, k);
            a[k] = b[k];
            k = k + 1 ;
        }
        __Loop_Invariant_Dummy1(b, iBegin, iEnd, a, k);
    }

    public static void __Loop_Invariant_Dummy1(int[] b, int iBegin, int iEnd, int[] a, int k) {}

    public static void main (String[] args) {
        int[] arr1 = new int[]{-2, -1, 0, 1, 2};
        int[] arr2 = new int[]{0, 0, 0};
        copyArray(arr1, 0, 3, arr2);
        arr1 = new int[]{-2, -1, 0, 1, 2};
        arr2 = new int[]{0, 0, 0, 0, 0};
        copyArray(arr1, 0, 0, arr2);
        arr1 = new int[]{114, 514, -1919, -1919};
        arr2 = new int[]{114, 514, 1919, 810, 114514};
        copyArray(arr1, 2, 4, arr2);
        arr1 = new int[]{-9, 114, 514, 1919, -810, 1987, 9283, 94, 9384};
        arr2 = new int[]{114, 514, 1919, 810, 114514, 0, 938, 37, 1, 23, -3};
        copyArray(arr1, 3, 8, arr2);
        arr1 = new int[]{-9, -114};
        arr2 = new int[]{114, -514};
        copyArray(arr1, 1, 2, arr2);
        arr1 = new int[]{0, 0, 0, 0, 0};
        arr2 = new int[]{0, 0, 0, 0, 0};
        copyArray(arr1, 0, 5, arr2);
    }

}

