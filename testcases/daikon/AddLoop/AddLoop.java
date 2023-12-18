public class AddLoop {

    public static int AddLoop(int x, int y) {
        int sum = x;
        if (y > 0) {
            int n = y;
	    __Loop_Invariant_Dummy1(x, y, n, sum);
            while (n > 0) {
                __Loop_Invariant_Dummy1(x, y, n, sum);
                sum = sum + 1;
                n = n - 1;
            }
        } else {
            int n = -y;
	    __Loop_Invariant_Dummy2(x, y, n, sum);
            while (n > 0) {
                __Loop_Invariant_Dummy2(x, y, n, sum);
                sum = sum - 1;
                n = n - 1;
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        AddLoop(-4, 0);
        AddLoop(0, -4);
        AddLoop(4, 0);
        AddLoop(0, 4);
        AddLoop(-4, -4);
        AddLoop(4, 4);
        AddLoop(0, 0);
        AddLoop(-4, 4);
        AddLoop(4, -4);
        AddLoop(1, -1);
        AddLoop(-1, 1);
        AddLoop(1, 2);
        AddLoop(2, 1);
        AddLoop(-2, -1);
        AddLoop(-1, -2);
        AddLoop(-2, 1);
        AddLoop(-1, 2);
        AddLoop(3, -5);
        AddLoop(-3, 5);
        AddLoop(3, 5);
        AddLoop(114, 514);
        AddLoop(-114, 514);
        AddLoop(514, 114);
        AddLoop(-114, -514);
    }

    public static void __Loop_Invariant_Dummy1(int x, int y, int n, int sum) {}
    
    public static void __Loop_Invariant_Dummy2(int x, int y, int n, int sum) {}
}
