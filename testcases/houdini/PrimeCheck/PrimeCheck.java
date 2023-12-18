class PrimeCheck {
   
	public static boolean isPrime(int a) {
		int i = 2;
		int mid = a/2;

		while (i <= mid) {
			__Loop_Invariant_Dummy1(a, i, mid);
			if (a%i == 0)
				return false;
			i++;
		}
		__Loop_Invariant_Dummy1(a, i, mid);
		return true;
	}

	public static void __Loop_Invariant_Dummy1(int a, int i, int mid) {}

    public static void main(String[] args) {
        isPrime(0);
        isPrime(1);
        isPrime(2);
        isPrime(-1);
        isPrime(-2);
		isPrime(4);
        isPrime(7);
        isPrime(8);
		isPrime(13);
		isPrime(17);
		isPrime(12);
		isPrime(16);
    }
}
