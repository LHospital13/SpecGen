public class IsCommonFactor {
    public static boolean isCommonFactor (int a, int b, int factor) {
        return a % factor == 0 && b % factor == 0;
    }
    public static void main(String[] args) {
        isCommonFactor(-4, 0, 1);
        isCommonFactor(0, -4, 2);
        isCommonFactor(4, 0, 5);
        isCommonFactor(0, 4, 1);
        isCommonFactor(-4, -4, 2);
        isCommonFactor(4, 4, 3);
        isCommonFactor(0, 0, 1);
        isCommonFactor(-4, 4, 2);
        isCommonFactor(4, -4, 1);
        isCommonFactor(1, -1, 1);
        isCommonFactor(-1, 1, 2);
        isCommonFactor(-1, 1, 1);
    }
}
