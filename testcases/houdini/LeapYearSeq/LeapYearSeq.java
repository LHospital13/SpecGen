public class LeapYearSeq {
    
    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) ? ((year % 100 == 0) ? ((year % 400 == 0) ? true : false) : true) : false);
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
