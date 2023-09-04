public class GCD {

	public int gcd(int num1, int num2){
		int result = 1; 
	 	num1 = (0 <= num1) ? num1 : -num1;
		num2 = (0 <= num2) ? num2 : -num2;

		if (num1 == 0 && num2 == 0) {
			return -1;	
		}

		if (num1 == 0 || num2 == 0) { 
			return (num1 > num2) ? num1 : num2;
		}

		for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
       			result = i;
			}
        }
		return result;
	}

	public void __HoudiniInvoker() {
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
    }
}
