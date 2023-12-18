public class AddLoopFor {
    public static int addLoop(int x, int y) {
        int sum = y;
        if (x > 0) {
            for(int n = x; n > 0; n = n - 1) {
                __Loop_Invariant_Dummy1(x, y, n, sum);
                sum = sum + 1;
            }
        } else {
            for(int n = -x; n > 0; n = n - 1) {
                __Loop_Invariant_Dummy2(x, y, n, sum);
                sum = sum - 1;
            }
        }
        return sum;
    }

    public static void __Loop_Invariant_Dummy1(int x, int y, int n, int sum) {}
    
    public static void __Loop_Invariant_Dummy2(int x, int y, int n, int sum) {}

    public static void main(String[] args) {
        addLoop(-4, 0);
        addLoop(0, -4);
        addLoop(4, 0);
        addLoop(0, 4);
        addLoop(-4, -4);
        addLoop(4, 4);
        addLoop(0, 0);
        addLoop(-4, 4);
        addLoop(4, -4);
        addLoop(1, -1);
        addLoop(-1, 1);
        addLoop(1, 2);
        addLoop(2, 1);
        addLoop(-2, -1);
        addLoop(-1, -2);
        addLoop(-2, 1);
        addLoop(-1, 2);
        addLoop(3, -5);
        addLoop(-3, 5);
        addLoop(3, 5);
        addLoop(114, 514);
        addLoop(-114, 514);
        addLoop(514, 114);
        addLoop(-114, -514);
    }
}
