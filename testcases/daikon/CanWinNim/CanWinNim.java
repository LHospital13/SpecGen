class CanWinNim {
    public static boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        canWinNim(-2);
        canWinNim(-1);
        canWinNim(0);
        canWinNim(1);
        canWinNim(2);
        canWinNim(3);
        canWinNim(4);
        canWinNim(114);
        canWinNim(514);
        canWinNim(715);
        canWinNim(1919);
        canWinNim(810);
        canWinNim(16);
        canWinNim(104);
    }
}
