class NegCounter {

    public int countNegInArray(int[] arr) {
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0)
                cnt = cnt + 1;
        }

        return cnt;
    }

    public void __HoudiniInvoker() {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        countNegInArray(arr);
        arr = new int[]{0};
        countNegInArray(arr);
        arr = new int[]{-2, -1};
        countNegInArray(arr);
        arr = new int[]{};
        countNegInArray(arr);
        arr = new int[]{0, 1};
        countNegInArray(arr);
        arr = new int[]{-2, -3};
        countNegInArray(arr);
    }

}