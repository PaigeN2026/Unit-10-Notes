public class Main {

   public static void main(String []args) {
      System.out.println("Recursive Methods");
      // neverEnd(); causes a StackOverflow error because INFINITE LOOP
   }

   // RECURSIVE methods call themselves (to repeat code) 
   // to INDENTIFY a recursive method, look for its name again in the curly brackets
   public static void neverEnd() {
      System.out.println("Recursion is cool");
      // Contains at least ONE CALL to itself in the METHOD BODY
      neverEnd();
   }

}
