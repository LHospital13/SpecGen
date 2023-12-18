public class IsCommonFactorBranch {
    public static boolean isCommonFactor (int a, int b, int factor) {
        if (a % factor != 0) {
            return false;
        }
        if (b % factor != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        isCommonFactor(-4, 0, 1);
        isCommonFactor(0, -4, 2);
        isCommonFactor(4, 0, 5);
        isCommonFactor(0, 4, 4);
        isCommonFactor(-4, -4, 2);
        isCommonFactor(4, 4, 3);
        isCommonFactor(0, 0, 1);
        isCommonFactor(-4, 4, 2);
        isCommonFactor(4, -4, 1);
        isCommonFactor(1, -1, 1);
        isCommonFactor(-1, 1, 2);
        isCommonFactor(114, 514, 2);
        isCommonFactor(114, 514, 4);
        isCommonFactor(1919, 810, 2);
        isCommonFactor(1919, 514, 1);
        isCommonFactor(16, 64, 16);
        isCommonFactor(27, 81, 9);
    }
}