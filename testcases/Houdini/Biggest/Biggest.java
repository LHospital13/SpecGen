public class Biggest {

    static public int biggest(int[] a) {
        if (a.length == 0) return -1;

        int index = 0;
        int biggest = 0;

        while (a.length - index > 0) {
            if (a[index] > a[biggest]) {
                biggest = index;
            }
            index = index + 1;
        }
        return biggest;
    }

    public void __HoudiniInvoker() {
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
    }
}