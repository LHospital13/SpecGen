public class LinearSearch {
    private static int location;

    public static int linearSearch(int array[], int search) {
        int c;

        for (c = 0; c < array.length; c++) { 
            __Loop_Invariant_Dummy1(array, search, c);
            if (array[c] == search) {
                location = c;
                break;
            }
        }
        __Loop_Invariant_Dummy1(array, search, c);
        if (c == array.length) {
            location = -1;
        }
        return location;
    }

    public static void __Loop_Invariant_Dummy1(int[] array, int search, int c) {}

    public static void main(String[] args) {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        linearSearch(arr, -2);
        arr = new int[]{0};
        linearSearch(arr, 0);
        arr = new int[]{-2, -1};
        linearSearch(arr, -1);
        arr = new int[]{2, 3};
        linearSearch(arr, 2);
        arr = new int[]{0, 1};
        linearSearch(arr, 1);
        arr = new int[]{-2, -3};
        linearSearch(arr, -3);
        arr = new int[]{0, 4};
        linearSearch(arr, 5);
        arr = new int[]{-2, -1, 8};
        linearSearch(arr, 8);
        arr = new int[]{2, 3};
        linearSearch(arr, 90);
        arr = new int[]{0, 1, 213, 703, 713};
        linearSearch(arr, 703);
        arr = new int[]{-2, 2, 114, 514, 810, 114514};
        linearSearch(arr, 810);
        arr = new int[]{-2, 2, 114, 512, 513, 514, 810, 927, 999, 114514};
        linearSearch(arr, 114514);
    }
}
