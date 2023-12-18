public class IsCommonMultiple {
    public static boolean isCommonMultiple (int a, int b, int m) {
        return m % a == 0 && m % b == 0;
    }

    public static void main(String[] args) {
        isCommonMultiple(1, 1, 1);
        isCommonMultiple(-1, -1, -1);
        isCommonMultiple(2, 3, 1);
        isCommonMultiple(6, 1, 6);
        isCommonMultiple(2, 114, 228);
        isCommonMultiple(3, 5, 7);
        isCommonMultiple(-5, -6, -30);
        isCommonMultiple(8, 9, 46);
        isCommonMultiple(7, 10, 49);
    }
}