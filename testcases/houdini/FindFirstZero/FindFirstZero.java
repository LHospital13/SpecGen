public class FindFirstZero {

    public static int FindFirstZero(int[] x) {
        if (x.length == 0) {
        	return -1;
        }
		else {
			int index = 0;

			while (x.length - index > 0 && x[index] != 0) {
                __Loop_Invariant_Dummy1(x, index);
				index = index + 1;
			}
            __Loop_Invariant_Dummy1(x, index);
			if (x.length - index == 0) {
				index = -1;
			}
			return index;
        }
    }

    public static void __Loop_Invariant_Dummy1(int[] x, int index) {}

	public static void main(String[] args) {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        FindFirstZero(arr);
        arr = new int[]{0};
        FindFirstZero(arr);
        arr = new int[]{-2, -1};
        FindFirstZero(arr);
        arr = new int[]{2, 3};
        FindFirstZero(arr);
        arr = new int[]{0, 1};
        FindFirstZero(arr);
        arr = new int[]{0, -3, 1, 10};
        FindFirstZero(arr);
        arr = new int[]{-2, -3, 0};
        FindFirstZero(arr);
        arr = new int[]{-2, -1, 8};
        FindFirstZero(arr);
        arr = new int[]{2};
        FindFirstZero(arr);
    }
}

