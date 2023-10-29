public class Smallest {

    static public int Smallest(int[] a) {
        if (a.length == 0) return -1;

        int index = 0;
        int smallest = 0;

        while (a.length - index > 0) {
            __Loop_Invariant_Dummy1(a, index, smallest);
            if (a[index] < a[smallest]) {
                smallest = index;
            }
            index = index + 1;
        }
        return smallest;
    }

    public static void __Loop_Invariant_Dummy1(int[] a, int index, int smallest) {}

    public static void main(String[] args) {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        Smallest(arr);
        arr = new int[]{};
        Smallest(arr);
        arr = new int[]{0};
        Smallest(arr);
        arr = new int[]{-2, -1};
        Smallest(arr);
        arr = new int[]{2, 3};
        Smallest(arr);
        arr = new int[]{0, -1};
        Smallest(arr);
        arr = new int[]{-2, -3, -114, 114};
        Smallest(arr);
        arr = new int[]{-2, -3, 245, -1145, 114, 810};
        Smallest(arr);
    }
}

