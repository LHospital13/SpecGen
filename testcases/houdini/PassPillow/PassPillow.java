class PassPillow {
    public static int passPillow(int n, int time) {
        time %= (n - 1) * 2;
        return time < n ? time + 1 : n * 2 - time - 1;
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
        passPillow(114, 514);
        passPillow(1919, 810);
    }
}