class CanWinNim {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public void __HoudiniInvoker() {
        canWinNim(-2);
        canWinNim(-1);
        canWinNim(0);
        canWinNim(1);
        canWinNim(2);
    }
}
