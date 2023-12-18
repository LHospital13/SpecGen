public class BinarySearch {

    public static int binarySearch(int[] arr, int key) {
        if (arr.length == 0) {
            return -1;
        } else {
            int low = 0;
            int high = arr.length;
            int mid =  high / 2;

            while (low < high && arr[mid] != key) {
                __Loop_Invariant_Dummy1(arr, key, low, high, mid);
                if (arr[mid] < key) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
                mid = low + (high - low) / 2;
            }
	        __Loop_Invariant_Dummy1(arr, key, low, high, mid);
            if (low >= high) {
                return -1;
            }
            return mid;
        }
    }

    public static void __Loop_Invariant_Dummy1(int[] arr, int key, int low, int high, int mid) {}

    public static void main(String[] args) {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        binarySearch(arr, -2);
        arr = new int[]{0};
        binarySearch(arr, 0);
        arr = new int[]{-1, -2};
        binarySearch(arr, -1);
        arr = new int[]{2, 3};
        binarySearch(arr, 2);
        arr = new int[]{0, 1};
        binarySearch(arr, 1);
        arr = new int[]{-2, 3};
        binarySearch(arr, -3);
        arr = new int[]{0, 4};
        binarySearch(arr, 5);
        arr = new int[]{-2, -1, 8};
        binarySearch(arr, 8);
        arr = new int[]{2, 3};
        binarySearch(arr, 90);
        arr = new int[]{0, 1, 213, 703, 713};
        binarySearch(arr, 703);
        arr = new int[]{-2, 2, 114, 514, 810, 114514};
        binarySearch(arr, 810);
        arr = new int[]{-2, 2, 114, 512, 513, 514, 810, 927, 999, 114514};
        binarySearch(arr, 114514);
    }
}
