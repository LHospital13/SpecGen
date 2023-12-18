public class GCD {

	public static int gcd(int num1, int num2){
		int result = 1; 
	 	num1 = (0 <= num1) ? num1 : -num1;
		num2 = (0 <= num2) ? num2 : -num2;

		if (num1 == 0 && num2 == 0) {
			return -1;	
		}

		if (num1 == 0 || num2 == 0) { 
			return (num1 > num2) ? num1 : num2;
		}
        int i = 1;
		for (i = 1; i <= num1 && i <= num2; i++) {
			__Loop_Invariant_Dummy1(num1, num2, result);
            if (num1 % i == 0 && num2 % i == 0) {
       			result = i;
			}
        }
		__Loop_Invariant_Dummy1(num1, num2, result);
		return result;
	}

	public static void __Loop_Invariant_Dummy1(int num1, int num2, int result) {}

	public static void main(String[] args) {
        gcd(-4, 0);
        gcd(0, -4);
        gcd(4, 0);
        gcd(0, 4);
        gcd(-4, -4);
        gcd(4, 4);
        gcd(0, 0);
        gcd(-4, 4);
        gcd(4, -4);
        gcd(1, -1);
        gcd(-1, 1);
		gcd(1, -1);
        gcd(-1, 1);
        gcd(1, 2);
        gcd(2, 1);
        gcd(-2, -1);
        gcd(-1, -2);
        gcd(-2, 1);
        gcd(-1, 2);
        gcd(3, -5);
        gcd(-3, 5);
        gcd(3, 5);
        gcd(114, 514);
        gcd(-114, 514);
        gcd(514, 114);
        gcd(-114, -514);
		gcd(16, 64);
		gcd(27, 81);
    }
}
