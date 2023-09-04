public class Smallest {

    static public int Smallest(int[] a) {
        if (a.length == 0) return -1;

        int index = 0;
        int smallest = 0;

        while (a.length - index > 0) {
            if (a[index] < a[smallest]) {
                smallest = index;
            }
            index = index + 1;
        }
        return smallest;
    }

    public void __HoudiniInvoker() {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        Smallest(arr);
        arr = new int[]{0};
        Smallest(arr);
        arr = new int[]{-2, -1};
        Smallest(arr);
        arr = new int[]{2, 3};
        Smallest(arr);
        arr = new int[]{0, 1};
        Smallest(arr);
        arr = new int[]{-2, -3};
        Smallest(arr);
    }
}

