public class StrPalindrome {
   private  String reverse = "";
   
   public boolean isPalindrome(String str) {
      
      int length = str.length();

      for (int i = length - 1; 0 <= i; i--) {
         __Loop_Invariant_Dummy1(str, length, i);
         reverse = reverse + str.charAt(i);
      }
      
      return reverse.equals(str);
   }

   public static void __Loop_Invariant_Dummy1(String str, int length, int i) {}

   void __HoudiniInvoker() {
      isPalindrome("");
      isPalindrome("a");
      isPalindrome("ab");
      isPalindrome("aba");
      isPalindrome("abab");
   }
} 
