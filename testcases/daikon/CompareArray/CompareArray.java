class CompareArray {

    public static boolean arrcmp(int[] a, int[] b) {
        if(a.length != b.length) {
	        return false;
        }

        for(int i = 0; i < a.length; i++) {
            __Loop_Invariant_Dummy1(a, b, i);
            if(a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void __Loop_Invariant_Dummy1(int[] a, int[] b, int i) {}

    public static void main(String[] args) {
        int[] arr1 = new int[]{-2, -1, 0, 1, 2};
        int[] arr2 = new int[]{-2, -1, 0, 1, 2};
        arrcmp(arr1, arr2);
        arr1 = new int[]{0};
        arr2 = new int[]{-2, -1};
        arrcmp(arr1, arr2);
        arr1 = new int[]{-2, -1};
        arr2 = new int[]{0, 1};
        arrcmp(arr1, arr2);
        arr1 = new int[]{2, 3};
        arr2 = new int[]{2, 3};
        arrcmp(arr1, arr2);
        arr1 = new int[]{0, 1};
        arr2 = new int[]{-2, -1, 0, 1, 2};
        arrcmp(arr1, arr2);
        arr1 = new int[]{-2, -3};
        arr2 = new int[]{0};
        arrcmp(arr1, arr2);
        arr1 = new int[]{-2, -3, 114, 514, 1919, 810};
        arr2 = new int[]{-2, -3, 114, 514, 1919, 810};
        arrcmp(arr1, arr2);
        arr1 = new int[]{-2, -3, 114, 114514, 1919, 810};
        arr2 = new int[]{-2, -3, 114, 514, 1919, 810};
        arrcmp(arr1, arr2);
        arr1 = new int[]{-2, -3, 114, 114514, 1919, 810, 19, 123, 348};
        arr2 = new int[]{-2, -3, 114, 514, 1919, 810, 34, 387, 837};
        arrcmp(arr1, arr2);
        arr1 = new int[]{-2, -3, 114, 514, 1919, 810, 19, 123, 348};
        arr2 = new int[]{-2, -3, 114, 514, 1919, 810, 19, 123, 348};
        arrcmp(arr1, arr2);
    }
}
