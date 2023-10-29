public class OddEven {	
 
	public  boolean isEven(int x) { 
        return x%2 == 0;
    } 

	public  boolean isOdd(int x) { 
        return x%2 != 0;
    }

	void __HoudiniInvoker() {
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
    }
}
