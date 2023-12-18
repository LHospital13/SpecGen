public class AbsSeq {
	
	public static int abs(int num) {
		return ((num < 0) ? (-num) : (num));
	}

	public static void main(String[] args) {
		abs(-4);
		abs(0);
		abs(4);
		abs(-1);
		abs(1);
		abs(2);
		abs(5);
		abs(7);
		abs(12);
		abs(14);
		abs(114);
		abs(-2);
		abs(-5);
		abs(-7);
		abs(-12);
		abs(-14);
		abs(-114);
	}
}
