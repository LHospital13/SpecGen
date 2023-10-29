public class Absolute {
	
	public static int Absolute(int num) {
		if (0 <= num)
			return num;
		else
			return -num;
	}

	
	public static long Absolute(long num) {
		if (0 <= num)
			return num;
		else
			return -num;	
	}

	public static void main(String[] args) {
		Absolute(-4);
		Absolute(0);
		Absolute(4);
		Absolute((long)-4);
		Absolute((long)0);
		Absolute((long)4);
		Absolute(-1);
		Absolute(1);
		Absolute((long)-1);
		Absolute((long)1);
		Absolute(2);
		Absolute(5);
		Absolute(7);
		Absolute(12);
		Absolute(14);
		Absolute(114);
		Absolute(-2);
		Absolute(-5);
		Absolute(-7);
		Absolute(-12);
		Absolute(-14);
		Absolute(-114);
		Absolute((long)2);
		Absolute((long)5);
		Absolute((long)7);
		Absolute((long)12);
		Absolute((long)14);
		Absolute((long)114);
		Absolute((long)-2);
		Absolute((long)-5);
		Absolute((long)-7);
		Absolute((long)-12);
		Absolute((long)-14);
		Absolute((long)-114);
	}
}
