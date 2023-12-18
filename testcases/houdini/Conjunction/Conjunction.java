public class Conjunction {
    public static boolean conjunctOf(boolean b1, boolean b2) {
        if(b1 == false)
            return false;
        if(b2 == false)
            return false;
        return true;
    }

    public static void main(String[] args) {
        conjunctOf(true, true);
        conjunctOf(true, false);
        conjunctOf(false, true);
        conjunctOf(false, false);
    }
}
