public class Disjunction {
    public static boolean disjunctOf(boolean b1, boolean b2) {
        if(b1 == true)
            return true;
        if(b2 == true)
            return true;
        return false;
    }

    public static void main(String[] args) {
        disjunctOf(true, true);
        disjunctOf(true, false);
        disjunctOf(false, true);
        disjunctOf(false, false);
    }
}
