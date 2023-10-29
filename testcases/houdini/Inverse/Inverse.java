public class Inverse {

    public static boolean Inverse(int[] x, int[] y) {
        if (x.length != y.length) return false;
        int index = 0;

        while (index < x.length) {
            __Loop_Invariant_Dummy1(x, y, index);
            if (x[index] != y[x.length - 1 - index]) {
                return false;
            } else {
                index = index + 1;
            }
        }
        return true;
    }

    public static void __Loop_Invariant_Dummy1(int[] x, int[] y, int index) {}

    public void __HoudiniInvoker() {
        int[] arr1 = new int[]{-2, -1, 0, 1, 2};
        int[] arr2 = new int[]{-2, -1, 0, 1, 2};
        Inverse(arr1, arr2);
        arr1 = new int[]{0};
        arr2 = new int[]{-2, -1};
        Inverse(arr1, arr2);
        arr1 = new int[]{-2, -1};
        arr2 = new int[]{0, 1};
        Inverse(arr1, arr2);
        arr1 = new int[]{2, 3};
        arr2 = new int[]{2, 3};
        Inverse(arr1, arr2);
        arr1 = new int[]{0, 1};
        arr2 = new int[]{-2, -1, 0, 1, 2};
        Inverse(arr1, arr2);
        arr1 = new int[]{-2, -3};
        arr2 = new int[]{-3, -2};
        Inverse(arr1, arr2);
    }
}
