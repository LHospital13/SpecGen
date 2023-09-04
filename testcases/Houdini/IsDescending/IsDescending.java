public class IsDescending {
    public boolean isDescending (int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return true;
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] <= arr[i+1])
                return false;
        }
        return true;
    }

    public void __HoudiniInvoker() {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        isDescending(arr);
        arr = new int[]{0};
        isDescending(arr);
        arr = new int[]{-2, -1};
        isDescending(arr);
        arr = new int[]{2, 3};
        isDescending(arr);
        arr = new int[]{0, 1};
        isDescending(arr);
        arr = new int[]{-2, -3};
        isDescending(arr);
    }
}