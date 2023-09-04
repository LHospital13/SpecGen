public class LinearSearch {
    private static  int location;

    public static int linearSearch(int array[], int search) {
        int c;

        for (c = 0; c < array.length; c++) {  
                if (array[c] == search) {
                location = c;
                break;
            }
        }
        if (c == array.length) {
            location = -1;
        }
        return location;
    }

    public void __HoudiniInvoker() {
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
    }
}
