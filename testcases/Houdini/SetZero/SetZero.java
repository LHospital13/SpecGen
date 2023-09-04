public class SetZero {

	public static void SetZero(int[] a, int iBegin, int iEnd) {
		int k = iBegin;

		while (k < iEnd) {
            a[k] = 0;
            k = k + 1 ;
        }
	}

	public void __HoudiniInvoker() {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        SetZero(arr, 0, 4);
        arr = new int[]{0};
        SetZero(arr, 0, 1);
        arr = new int[]{-2, -1};
        SetZero(arr, 1, 2);
        arr = new int[]{2, 3};
        SetZero(arr, 0, 1);
        arr = new int[]{0, 1};
        SetZero(arr, 1, 0);
        arr = new int[]{-2, -3};
        SetZero(arr, 0, 0);
    }
}
