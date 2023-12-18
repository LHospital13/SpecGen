public class NotCommonFactor {
    public static boolean notCommonFactor (int a, int b, int factor) {
        return a % factor != 0 || b % factor != 0;
    }

    public static void main(String[] args) {
        notCommonFactor(-4, 0, 1);
        notCommonFactor(0, -4, 2);
        notCommonFactor(4, 0, 5);
        notCommonFactor(0, 4, 4);
        notCommonFactor(-4, -4, 2);
        notCommonFactor(4, 4, 3);
        notCommonFactor(0, 0, 1);
        notCommonFactor(-4, 4, 2);
        notCommonFactor(4, -4, 1);
        notCommonFactor(1, -1, 1);
        notCommonFactor(-1, 1, 2);
        notCommonFactor(114, 514, 2);
        notCommonFactor(114, 514, 4);
        notCommonFactor(1919, 810, 2);
        notCommonFactor(1919, 514, 1);
        notCommonFactor(16, 64, 16);
        notCommonFactor(27, 81, 9);
    }
}