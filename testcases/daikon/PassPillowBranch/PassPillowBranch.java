class PassPillowBranch {
    public static int passPillow(int n, int time) {
        time = time % (n - 1) * 2;
        if (time < n) {
            return time + 1;
        }
        return n * 2 - time - 1;
    }

    public static void main(String[] args) {
        passPillow(0, 0);
        passPillow(2, 1);
        passPillow(2, 2);
        passPillow(2, 3);
        passPillow(3, 1);
        passPillow(3, 2);
        passPillow(3, 3);
        passPillow(3, 114);
        passPillow(4, 3);
        passPillow(114, 514);
        passPillow(1919, 810);
        passPillow(1919, 811);
        passPillow(1622, 1621);
    }
}