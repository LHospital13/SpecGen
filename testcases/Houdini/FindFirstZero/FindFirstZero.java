public class FindFirstZero {

    public static int FindFirstZero(int[] x) {
        if (x.length == 0) {
        	return -1;
        }
		else {
			int index = 0;

			while (x.length - index > 0 && x[index] != 0) {
				index = index + 1;
			}
			if (x.length - index == 0) {
				index = -1;
			}
			return index;
        }
    }

	public void __HoudiniInvoker() {
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
        arr = new int[]{-2, -3};
        FindFirstZero(arr);
    }
}

