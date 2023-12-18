public class EchoIntLoop {
    public static int echo(int x) {
        int res = 0;
        for(int i = 0; i < x; i++) {
            __Loop_Invariant_Dummy1(x, res, i);
            res = res + 1;
        }
        return res;
    }

    public static void __Loop_Invariant_Dummy1(int x, int res, int i) {}

    public static void main(String[] args) {
        echo(-1);
        echo(-3);
        echo(0);
        echo(1);
        echo(2);
        echo(3);
    }
}