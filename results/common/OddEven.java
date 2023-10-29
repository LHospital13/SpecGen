public class OddEven {	
 
	//@ ensures \result == (x%2 == 0);
	public  boolean isEven(int x) { 
        	return x%2 == 0;
       	} 

	//@ ensures \result == (x%2 != 0);
	public  boolean isOdd(int x) { 
        	return x%2 != 0;
       	} 
}

