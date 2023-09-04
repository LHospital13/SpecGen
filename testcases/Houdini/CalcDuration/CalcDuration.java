class CalcDuration {
    public int calcDuration(int[] timeSeries, int duration) {
        int ans = 0;
        int expired = 0;
        for (int i = 0; i < timeSeries.length; ++i) {
            if (timeSeries[i] >= expired) {
                ans += duration;
            } else {
                ans += timeSeries[i] + duration - expired;
            }
            expired = timeSeries[i] + duration;
        }
        return ans;
    }

    public void __HoudiniInvoker() {
        int[] arr = new int[]{0, 1, 2, 3, 4};
        calcDuration(arr, 0);
        arr = new int[]{0};
        calcDuration(arr, 1);
        arr = new int[]{1, 3};
        calcDuration(arr, 2);
        arr = new int[]{2, 3};
        calcDuration(arr, 1);
        arr = new int[]{0, 1};
        calcDuration(arr, 1);
        arr = new int[]{1, 3, 5};
        calcDuration(arr, 3);
    }
}