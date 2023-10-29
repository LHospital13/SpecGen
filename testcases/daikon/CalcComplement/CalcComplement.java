class CalcComplement {
    public static int calcComplement(int num) {
        int highbit = 0;
        for (int i = 1; i <= 30; ++i) {
            __Loop_Invariant_Dummy1(num, highbit, i);
            if (num >= 1 << i) {
                highbit = i;
            } else {
                break;
            }            
        }
        int mask = highbit == 30 ? 0x7fffffff : (1 << (highbit + 1)) - 1;
        return num ^ mask;
    }

    public static void __Loop_Invariant_Dummy1(int num, int highbit, int i) {}

    public static void main(String[] args) {
        calcComplement(-2);
        calcComplement(-1);
        calcComplement(0);
        calcComplement(1);
        calcComplement(2);
        calcComplement(3);
        calcComplement(114);
        calcComplement(514);
        calcComplement(715);
        calcComplement(1919);
        calcComplement(810);
    }
}
