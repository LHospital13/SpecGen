public class Fibonacci {

	public static int fibCompute(int n) {
		if(n < 0) return -1;
		else if(n == 0) return 0;

		int[] fib = new int[n + 1];
		fib[0] = 0;
		fib[1] = 1;
		int index = 2;

		while (index < fib.length) {
			__Loop_Invariant_Dummy1(n, fib, index);
			fib[index] = fib[index - 2] + fib[index - 1];
			index++;         
		}

		return fib[n];
	}

	public static void __Loop_Invariant_Dummy1(int n, int[] fib, int index) {}

	public static void main(String[] args) {
		fibCompute(-1);
		fibCompute(-2);
		fibCompute(0);
		fibCompute(1);
		fibCompute(2);
		fibCompute(3);
		fibCompute(4);
		fibCompute(5);
		fibCompute(6);
		fibCompute(7);
		fibCompute(8);
		fibCompute(9);
		fibCompute(10);
	}
}
