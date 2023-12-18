public class SubLoop {
    public static int subLoop(int x, int y) {
        int sum = x;
        if (y > 0) {
            int n = y;
            while (n > 0) {
                __Loop_Invariant_Dummy1(x, y, n, sum);
                sum = sum - 1;
                n = n - 1;
            }
        } else {
            int n = -y;
            while (n > 0) {
                __Loop_Invariant_Dummy2(x, y, n, sum);
                sum = sum + 1;
                n = n - 1;
            }
        }
        return sum;
    }

    public static void __Loop_Invariant_Dummy1(int x, int y, int n, int sum) {}
    
    public static void __Loop_Invariant_Dummy2(int x, int y, int n, int sum) {}

    public static void main(String[] args) {
        subLoop(-4, 0);
        subLoop(0, -4);
        subLoop(4, 0);
        subLoop(0, 4);
        subLoop(-4, -4);
        subLoop(4, 4);
        subLoop(0, 0);
        subLoop(-4, 4);
        subLoop(4, -4);
        subLoop(1, -1);
        subLoop(-1, 1);
        subLoop(1, 2);
        subLoop(2, 1);
        subLoop(-2, -1);
        subLoop(-1, -2);
        subLoop(-2, 1);
        subLoop(-1, 2);
        subLoop(3, -5);
        subLoop(-3, 5);
        subLoop(3, 5);
        subLoop(114, 514);
        subLoop(-114, 514);
        subLoop(514, 114);
        subLoop(-114, -514);
    }

}
