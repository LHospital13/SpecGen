public class BinarySearch {

    public static int binarySearch(int[] arr, int key) {
        if (arr.length == 0) {
            return -1;
        } else {
            int low = 0;
            int high = arr.length;
            int mid =  high / 2;

            while (low < high && arr[mid] != key) {
                if (arr[mid] < key) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
                mid = low + (high - low) / 2;
            }
            if (low >= high) {
                return -1;
            }
            return mid;
        }
    }

    public void __HoudiniInvoker() {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        binarySearch(arr, -2);
        arr = new int[]{0};
        binarySearch(arr, 0);
        arr = new int[]{-2, -1};
        binarySearch(arr, -1);
        arr = new int[]{2, 3};
        binarySearch(arr, 2);
        arr = new int[]{0, 1};
        binarySearch(arr, 1);
        arr = new int[]{-2, -3};
        binarySearch(arr, -3);
    }
}
