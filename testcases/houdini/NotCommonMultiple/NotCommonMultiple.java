public class NotCommonMultiple {
    public static boolean notCommonMultiple (int a, int b, int m) {
        return m % a != 0 || m % b != 0;
    }

    public static void main(String[] args) {
        notCommonMultiple(1, 1, 1);
        notCommonMultiple(-1, -1, -1);
        notCommonMultiple(2, 3, 1);
        notCommonMultiple(6, 1, 6);
        notCommonMultiple(2, 114, 228);
        notCommonMultiple(3, 5, 7);
        notCommonMultiple(-5, -6, -30);
        notCommonMultiple(8, 9, 46);
        notCommonMultiple(7, 10, 49);
    }
}