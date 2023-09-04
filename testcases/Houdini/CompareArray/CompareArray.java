class CompareArray {

    public static boolean arrcmp(int[] a, int[] b) {
        if(a.length != b.length) {
	        return false;
        }

        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public void __HoudiniInvoker() {
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
    }
}
