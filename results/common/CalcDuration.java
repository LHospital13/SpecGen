class CalcDuration {
    //@ requires timeSeries != null;
    //@ requires duration > 0;
 
    public int calcDuration(int[] timeSeries, int duration) {
        int ans = 0;
        int expired = 0;
        //@ maintaining 0 <= i && i <= timeSeries.length;
 
 
        //@ maintaining i == 0 ==> expired == 0;
        //@ maintaining i > 0 ==> expired == timeSeries[i-1] + duration;
        //@ decreases timeSeries.length - i;
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
}

