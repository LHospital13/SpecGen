public class DivisorGame {
    public static boolean divisorGame(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        divisorGame(-5);
        divisorGame(-4);
        divisorGame(-3);
        divisorGame(-2);
        divisorGame(-1);
        divisorGame(0);
        divisorGame(1);
        divisorGame(2);
        divisorGame(3);
        divisorGame(4);
        divisorGame(114);
        divisorGame(1919);
    }
}
