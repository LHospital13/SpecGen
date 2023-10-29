public class LinearSearch {
     private static  int location;

     //@ requires array != null;
     //@ ensures (\exists int i; 0 <= i && i < array.length; array[i] == search) ==> \result >= 0 && \result < array.length && array[\result] == search;
     //@ ensures (\forall int i; 0 <= i && i < array.length; array[i] != search) ==> \result == -1;
     public static int linearSearch(int search, int array[]) {
	      int c;

        //@ maintaining 0 <= c && c <= array.length;
        //@ maintaining (\forall int i; 0 <= i && i < c; array[i] != search);
        //@ decreases array.length - c;
        for (c = 0; c < array.length; c++) {  
          if (array[c] == search) {
	      location = c;
              break;
          }
        }
       if (c == array.length) {
            location = -1;
       }
     return location;
     }
}

