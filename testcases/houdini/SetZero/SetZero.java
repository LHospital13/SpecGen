public class SetZero {

	public static void SetZero(int[] a, int iBegin, int iEnd) {
		int k = iBegin;

		while (k < iEnd) {
            __Loop_Invariant_Dummy1(a, iBegin, iEnd, k);
            a[k] = 0;
            k = k + 1 ;
        }
        __Loop_Invariant_Dummy1(a, iBegin, iEnd, k);
	}

    public static void __Loop_Invariant_Dummy1(int[] a, int iBegin, int iEnd, int k) {}

	public static void main(String[] args) {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        SetZero(arr, 0, 4);
        arr = new int[]{514, 114, 114514, 2};
        SetZero(arr, 0, 4);
        arr = new int[]{514, 114, 114514, 2};
        SetZero(arr, 2, 4);
        arr = new int[]{514, 114, 114514, 2};
        SetZero(arr, 3, 4);
        arr = new int[]{0};
        SetZero(arr, 0, 1);
        arr = new int[]{-2, -1};
        SetZero(arr, 1, 2);
        arr = new int[]{2, 3};
        SetZero(arr, 0, 1);
        arr = new int[]{0, 1};
        SetZero(arr, 1, 0);
        arr = new int[]{-2, -3, 0};
        SetZero(arr, 0, 0);
    }
}
