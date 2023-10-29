class DistOfArrays {
    public int distBetween(int[] arr1, int[] arr2, int d) {
        int cnt = 0;

        for (int i = 0; i < arr1.length; i++) {
            int x = arr1[i];
            boolean ok = true;
            for (int j = 0; j < arr2.length; j++) {
                int y = arr2[j];
                ok &= ((x>y)?(x-y):(y-x)) > d;
            }
            cnt += ok ? 1 : 0;
        }
        
        return cnt;
    }

    public void __HoudiniInvoker() {
        int[] arr1 = new int[]{-2, -1, 0, 1, 2};
        int[] arr2 = new int[]{-2, -1, 0, 1, 2};
        distBetween(arr1, arr2, 0);
        arr1 = new int[]{0};
        arr2 = new int[]{-2, -1};
        distBetween(arr1, arr2, 1);
        arr1 = new int[]{-2, -1};
        arr2 = new int[]{0, 1};
        distBetween(arr1, arr2, 2);
        arr1 = new int[]{2, 3};
        arr2 = new int[]{2, 3};
        distBetween(arr1, arr2, 1);
        arr1 = new int[]{0, 1};
        arr2 = new int[]{-2, -1, 0, 1, 2};
        distBetween(arr1, arr2, 2);
        arr1 = new int[]{-2, -3};
        arr2 = new int[]{0};
        distBetween(arr1, arr2, 1);
    }
}