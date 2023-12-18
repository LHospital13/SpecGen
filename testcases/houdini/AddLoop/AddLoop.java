public class AddLoop {

    public static int AddLoop(int x, int y) {
        int sum = x;
        if (y > 0) {
            int n = y;
            while (n > 0) {
                __Loop_Invariant_Dummy1(x, y, n, sum);
                sum = sum + 1;
                n = n - 1;
            }
	    __Loop_Invariant_Dummy1(x, y, n, sum);
        } else {
            int n = -y;
            while (n > 0) {
                __Loop_Invariant_Dummy2(x, y, n, sum);
                sum = sum - 1;
                n = n - 1;
            }
	    __Loop_Invariant_Dummy2(x, y, n, sum);
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
    }

    public static void __Loop_Invariant_Dummy1(int x, int y, int n, int sum) {}
    
    public static void __Loop_Invariant_Dummy2(int x, int y, int n, int sum) {}
}
