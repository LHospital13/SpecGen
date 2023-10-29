public class LeapYear {
    
    public static boolean isLeapYear(int year) {
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

    public static void main(String[] args) {
        isLeapYear(0);
        isLeapYear(1);
        isLeapYear(2);
        isLeapYear(2000);
        isLeapYear(2004);
        isLeapYear(2008);
        isLeapYear(2001);
        isLeapYear(2010);
        isLeapYear(2011);
    }
}
