public class LeapYear {
    
    public  boolean isLeapYear(int year) {
        boolean leap = false;
         
        if (year % 4 == 0)
        {
            if ( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
	
	    return leap;
    }

    public void __HoudiniInvoker() {
        isLeapYear(0);
        isLeapYear(1);
        isLeapYear(2);
        isLeapYear(2000);
    }
}
