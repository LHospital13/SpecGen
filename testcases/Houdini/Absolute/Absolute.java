public class Absolute {
	
	public  int Absolute(int num) {
		if (0 <= num)
			return num;
		else
			return -num;
	}

	
	public  long Absolute(long num) {
		if (0 <= num)
			return num;
		else
			return -num;	
	}

	public void __HoudiniInvoker() {
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
	}
}
