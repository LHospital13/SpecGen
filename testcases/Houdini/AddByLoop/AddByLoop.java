public class AddByLoop {

    public static int AddByLoop(int x, int y) {
        int sum = x;
        if (y > 0) {
            int n = y;
            while (n > 0) {
                sum = sum + 1;
                n = n - 1;
            }
        } else {
            int n = -y;
            while (n > 0) {
                sum = sum - 1;
                n = n - 1;
            }
        }
        return sum;
    }
    
    public void __HoudiniInvoker() {
        AddByLoop(-4, 0);
        AddByLoop(0, -4);
        AddByLoop(4, 0);
        AddByLoop(0, 4);
        AddByLoop(-4, -4);
        AddByLoop(4, 4);
        AddByLoop(0, 0);
        AddByLoop(-4, 4);
        AddByLoop(4, -4);
        AddByLoop(1, -1);
        AddByLoop(-1, 1);
    }
}
