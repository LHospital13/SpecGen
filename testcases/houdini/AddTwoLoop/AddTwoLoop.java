public class AddTwoLoop {
    public static int addLoop(int a, int b) {
        int m = ((a < 0) ? -a : a);
        int n = ((b < 0) ? -b : b);
        int res = 0;
        for(int i = 0; i < m; i++){
            __Loop_Invariant_Dummy1(a,b,m,n,i,res);
            res = res + ((a < 0) ? -1 : 1);
        }
        for(int i = 0; i < n; i++){
            __Loop_Invariant_Dummy2(a,b,m,n,i,res);
            res = res + ((b < 0) ? -1 : 1);
        }
        return res;
    }

    public static void __Loop_Invariant_Dummy1(int a, int b, int m, int n, int i, int res) {}
    
    public static void __Loop_Invariant_Dummy2(int a, int b, int m, int n, int i, int res) {}

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
    }
}