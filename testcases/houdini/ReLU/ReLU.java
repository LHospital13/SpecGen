public class ReLU {
    public static double computeReLU(double x) {
        if(x >= 0) {
            return x;
        }
        return 0.0;
    }

    public static void main(String[] args) {
        computeReLU(-5);
        computeReLU(-4.4);
        computeReLU(-3.8);
        computeReLU(-2);
        computeReLU(-1);
        computeReLU(0);
        computeReLU(1);
        computeReLU(2);
        computeReLU(3.14);
    }
}