class CalcComplement {
    public int calcComplement(int num) {
        int highbit = 0;
        for (int i = 1; i <= 30; ++i) {
            if (num >= 1 << i) {
                highbit = i;
            } else {
                break;
            }            
        }
        int mask = highbit == 30 ? 0x7fffffff : (1 << (highbit + 1)) - 1;
        return num ^ mask;
    }

    public void __HoudiniInvoker() {
        calcComplement(-2);
        calcComplement(-1);
        calcComplement(0);
        calcComplement(1);
        calcComplement(2);
    }
}