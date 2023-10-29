public class Inverse {

    //@ requires x != null && y != null;
    //@ requires x.length == y.length;
    //@ ensures \result == (\forall int i; 0 <= i && i < x.length; x[i] == y[x.length - 1 - i]);
    public static boolean Inverse(int[] x, int[] y) {
        if (x.length != y.length) return false;
        int index = 0;

        //@ maintaining 0 <= index && index <= x.length;
        //@ maintaining (\forall int i; 0 <= i && i < index; x[i] == y[x.length - 1 - i]);
        //@ decreases x.length - index;
        while (index < x.length) {
            if (x[index] != y[x.length - 1 - index]) {
                return false;
            } else {
                index = index + 1;
            }
        }
        return true;
    }
}

