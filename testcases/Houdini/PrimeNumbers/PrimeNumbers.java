public class PrimeNumbers{

      private  int primeArray[];

      public int[] primeList(int n)
      {
            int status = 1, num = 3, count, j;
            primeArray = new int[n];
            primeArray[0] = 2;

            for (count = 2; count <= n;)
            { 
                  for (j = 2; j <= num/2; j++)
                  { 
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

      void __HoudiniInvoker() {
         primeList(1);
         primeList(2);
         primeList(3);
         primeList(4);
         primeList(5);
      }

}
