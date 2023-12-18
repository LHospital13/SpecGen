import java.lang.Math;

public class SolveQuadraticEquation {
    public static double[] solve(int a, int b, int c) {
        double[] res = new double[2];
        double delta = b * b - 4 * a * c;
        if(delta >= 0) {
            res[0] = (-b - Math.sqrt(delta)) / (2 * a);
            res[1] = 0;
        }
        else {
            res[0] = -b / (2*a);
            res[1] = Math.sqrt(-delta) / (2*a);
        }
        return res;
    }

    public static void main(String[] args) {
        solve(1, 2, 1);
        solve(-1, 0, 0);
        solve(1, 0, 0);
        solve(-1, 0, 1);
        solve(-1, -1, 1);
        solve(114, -514, 1919);
        solve(114, 514, 1919);
        solve(-114, 514, -1919);
    }
}
