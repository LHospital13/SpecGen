public class Absolute {
	
	//@ ensures \result == num && num >= 0 || \result == -num && num < 0;
	public int Absolute(int num) {
		if (0 <= num)
			return num;
		else
			return -num;
	}

	//@ ensures \result == num && num >= 0 || \result == -num && num < 0;
	public long Absolute(long num) {
		if (0 <= num)
			return num;
		else
			return -num;	
	}
}


