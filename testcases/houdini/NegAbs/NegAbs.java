public class NegAbs {
	
	public static int negAbs(int num) {
		if (num < 0)
			return num;
		else
			return -num;
	}
	
	public static void main(String[] args) {
		negAbs(-4);
		negAbs(0);
		negAbs(4);
		negAbs(-1);
		negAbs(1);
		negAbs(2);
		negAbs(5);
		negAbs(7);
		negAbs(12);
		negAbs(14);
		negAbs(114);
		negAbs(-2);
		negAbs(-5);
		negAbs(-7);
		negAbs(-12);
		negAbs(-14);
		negAbs(-114);
	}
}
