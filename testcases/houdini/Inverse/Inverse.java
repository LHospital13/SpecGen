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
        __Loop_Invariant_Dummy1(x, y, index);
        return true;
    }

    public static void __Loop_Invariant_Dummy1(int[] x, int[] y, int index) {}

    public static void main(String[] args) {
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
        arr1 = new int[]{0, 0, 0, 0, 0};
        arr2 = new int[]{0, 0, 0, 0, 0};
        Inverse(arr1, arr2);
        arr1 = new int[]{0, 0, 0, 0, 0, 0};
        arr2 = new int[]{0, 0, 0, 0, 0, 0};
        Inverse(arr1, arr2);
        arr1 = new int[]{0, 0, 0, 0, 0, 0, 0};
        arr2 = new int[]{0, 0, 0, 0, 0, 0, 0};
        Inverse(arr1, arr2);
        arr1 = new int[]{-2, -1, 0, 1, 2};
        arr2 = new int[]{0, 0, 0};
        Inverse(arr1, arr2);
        arr1 = new int[]{-2, -1, 0, 1, 2};
        arr2 = new int[]{0, 0, 0, 0, 0};
        Inverse(arr1, arr2);
        arr1 = new int[]{114, 514, -1919, -1919};
        arr2 = new int[]{114, 514, 1919, 810, 114514};
        Inverse(arr1, arr2);
        arr1 = new int[]{-9, 114, 514, 1919, -810, 1987, 9283, 94, 9384};
        arr2 = new int[]{114, 514, 1919, 810, 114514, 0, 938, 37, 1, 23, -3};
        Inverse(arr1, arr2);
        arr1 = new int[]{-9, -114, 1, 129, 93, 23};
        arr2 = new int[]{23, 93, 129, 1, -114, -9};
        Inverse(arr1, arr2);
        arr1 = new int[]{-9, 114, 514, 1919, -810, 1987, 9283, 94, 9384};
        arr2 = new int[]{-9, 114, 514, 1919, -810, 1987, 9283, 94, 9384};
        Inverse(arr1, arr2);
    }
}
