public class Biggest {

    static public int biggest(int[] a) {
        if (a.length == 0) return -1;

        int index = 0;
        int biggest = 0;

        while (a.length - index > 0) {
            __Loop_Invariant_Dummy1(a, index, biggest);
            if (a[index] > a[biggest]) {
                biggest = index;
            }
            index = index + 1;
        }
        return biggest;
    }

    public static void __Loop_Invariant_Dummy1(int[] a, int index, int biggest) {}

    public static void main(String[] args) {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        biggest(arr);
        arr = new int[]{0};
        biggest(arr);
        arr = new int[]{-2, -1};
        biggest(arr);
        arr = new int[]{2, 3};
        biggest(arr);
        arr = new int[]{0, 1};
        biggest(arr);
        arr = new int[]{-2, -3};
        biggest(arr);
        arr = new int[]{0, 4};
        biggest(arr);
        arr = new int[]{-2, -1, 8};
        biggest(arr);
        arr = new int[]{2, 3};
        biggest(arr);
        arr = new int[]{0, 1};
        biggest(arr);
        arr = new int[]{-2, -3, 2, 114, 514, 810, 114514};
        biggest(arr);
    }
}