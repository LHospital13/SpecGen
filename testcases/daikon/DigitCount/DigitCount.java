import java.util.Map;
import java.util.HashMap;

class DigitCount {
    public static boolean digitCount(String num) {
        Map<Integer, Integer> h = new HashMap<Integer, Integer>();
        int n = num.length();
        for (int i = 0; i < n; i++) {
            __Loop_Invariant_Dummy1(num, h, n, i);
            int digit = num.charAt(i) - '0';
            h.put(digit, h.getOrDefault(digit, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            __Loop_Invariant_Dummy2(num, h, n, i);
            int v = num.charAt(i) - '0';
            if (h.getOrDefault(i, 0) != v) {
                return false;
            }
        }
        return true;
    }

    public static void __Loop_Invariant_Dummy1(String num, Map<Integer, Integer> h, int n, int i) {}

    public static void __Loop_Invariant_Dummy2(String num, Map<Integer, Integer> h, int n, int i) {}

    public static void main (String[] args) {
        digitCount("");
        digitCount("0");
        digitCount("1");
        digitCount("22");
        digitCount("123");
        digitCount("14");
        digitCount("713");
        digitCount("114");
        digitCount("514");
        digitCount("1919");
        digitCount("810");
        digitCount("114514");
        digitCount("1919810");
    }
}