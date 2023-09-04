public class Add {

    public static int Add(int x, int y) {
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
    
    public void MyInvoker() {
        Add(1,2);
        Add(2,1);
        Add(-1,2);
        Add(2,-1);
    }
}
