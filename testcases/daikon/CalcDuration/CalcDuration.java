class CalcDuration {
    public static int calcDuration(int[] timeSeries, int duration) {
        int ans = 0;
        int expired = 0;
        for (int i = 0; i < timeSeries.length; ++i) {
            __Loop_Invariant_Dummy1(timeSeries, duration, ans, expired, i);
            if (timeSeries[i] >= expired) {
                ans += duration;
            } else {
                ans += timeSeries[i] + duration - expired;
            }
            expired = timeSeries[i] + duration;
        }
        return ans;
    }

    public static void __Loop_Invariant_Dummy1(int[] ts, int d, int ans, int expired, int i) {}

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2};
        calcDuration(arr, 2);
        arr = new int[]{0};
        calcDuration(arr, 0);
        arr = new int[]{1, 2};
        calcDuration(arr, 1);
        arr = new int[]{2, 3};
        calcDuration(arr, 7);
        arr = new int[]{0, 1, 10, 14};
        calcDuration(arr, 1);
        arr = new int[]{2, 7};
        calcDuration(arr, 3);
        arr = new int[]{0, 4, 10, 17, 21, 30};
        calcDuration(arr, 5);
        arr = new int[]{2, 5, 8};
        calcDuration(arr, 8);
        arr = new int[]{2, 3};
        calcDuration(arr, 90);
        arr = new int[]{0, 1, 213, 703, 713};
        calcDuration(arr, 703);
        arr = new int[]{2, 114, 514, 810, 114514};
        calcDuration(arr, 810);
        arr = new int[]{2, 114, 512, 513, 514, 810, 927, 999, 114514};
        calcDuration(arr, 114514);
    }
}