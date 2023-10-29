public class OddEven {	
 
	public static boolean isEven(int x) { 
        return x%2 == 0;
    } 

	public static boolean isOdd(int x) { 
        return x%2 != 0;
    }

    public static void main(String[] args) {
        isEven(0);
        isEven(1);
        isEven(2);
        isEven(-1);
        isEven(-2);
		isOdd(0);
        isOdd(1);
        isOdd(2);
        isOdd(-1);
        isOdd(-2);
        isEven(114);
        isOdd(114);
        isEven(1919);
        isOdd(1919);
        isEven(-1919);
        isOdd(-1919);
    }
}
