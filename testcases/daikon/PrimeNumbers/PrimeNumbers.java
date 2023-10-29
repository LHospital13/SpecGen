public class PrimeNumbers{

      private static int primeArray[];

      public static int[] primeList(int n)
      {
            int status = 1, num = 3, count, j;
            primeArray = new int[n];
            primeArray[0] = 2;

            for (count = 2; count <= n;)
            { 
                  __Loop_Invariant_Dummy1(n, status, num, count, primeArray);
                  for (j = 2; j <= num/2; j++)
                  { 
                        __Loop_Invariant_Dummy2(n, status, num, count, j, primeArray);
                        if (num%j == 0)
                        {
                              status = 0;
                              break;
                        }
                  }

                  if (status != 0)
                  {  
                        primeArray[count - 1] = num;
                        count++;
                  }
                  status = 1;

                  num++;
            } 
            return primeArray; 
      }

      public static void __Loop_Invariant_Dummy1 (int n, int status, int num, int count, int[] primeArray) {}

      public static void __Loop_Invariant_Dummy2 (int n, int status, int num, int count, int j, int[] primeArray) {}

    public static void main(String[] args) {
         primeList(1);
         primeList(2);
         primeList(3);
         primeList(4);
         primeList(5);
         primeList(6);
         primeList(7);
         primeList(8);
      }

}
