public class MulLoop {

	public static int mulLoop(int a, int b) {
        int res = 0;
        if (b >= 0) {
            for(int i = 0; i < b; i++) {
                __Loop_Invariant_Dummy1(a, b, res, i);
                res = res + a;
            }
        } else {
            for(int i = 0; i < -b; i++) {
                __Loop_Invariant_Dummy2(a, b, res, i);
                res = res - a;
            }
        }
        return res;
    }

    public static void __Loop_Invariant_Dummy1(int a, int b, int res, int i) {}

    public static void __Loop_Invariant_Dummy2(int a, int b, int res, int i) {}

    public static void main(String[] args) {
        mulLoop(-4, 0);
        mulLoop(0, -4);
        mulLoop(4, 0);
        mulLoop(0, 4);
        mulLoop(-4, -4);
        mulLoop(4, 4);
        mulLoop(0, 0);
        mulLoop(-4, 4);
        mulLoop(4, -4);
        mulLoop(1, -1);
        mulLoop(-1, 1);
        mulLoop(1, 1);
        mulLoop(2, 1);
        mulLoop(1, 2);
        mulLoop(-2, -1);
        mulLoop(-1, -2);
        mulLoop(-2, 1);
        mulLoop(-1, 2);
        mulLoop(3, -5);
        mulLoop(-3, 5);
        mulLoop(3, 5);
        mulLoop(114, 514);
        mulLoop(-114, 514);
        mulLoop(514, 114);
        mulLoop(-114, -514);
    }

}