public class Abs {
	
	public static int abs(int num) {
		if (num < 0)
			return -num;
		else
			return num;
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

