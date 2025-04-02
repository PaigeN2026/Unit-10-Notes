public class Main {

   public static void main(String []args) {
      System.out.println("Recursive Methods");
      // neverEnd(); causes a StackOverflow error because INFINITE LOOP

      // Test the factorial method
      System.out.println(factorial(5));
      System.out.println(factorial(4));
      System.out.println(factorial(31)); // LIMIT for integer data type
   }

   // RECURSIVE methods call themselves (to repeat code) 
   // to INDENTIFY a recursive method, look for its name again in the curly brackets
   public static void neverEnd() {
      System.out.println("Recursion is cool");
      // Contains at least ONE CALL to itself in the METHOD BODY
      neverEnd();
   }

   // Recursive methods need a BASE CASE to stop
   public static int factorial(int n) {
      // BASE CASE condition: stop at 1
      if (n == 1) {
         return 1;
      }
      // Otherwise, return a RECURSIVE call to continue
      else {
         return n * factorial(n-1);
      }
   }

}
