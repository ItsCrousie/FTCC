import java.util.Scanner;

public class BreakAndContinue {
   public static void main(String [] args){
      Scanner scnr = new Scanner(System.in);
      int result;
      int stop;
      int a;
      int b;

      stop = scnr.nextInt();

      for (a = 2; a < 5; ++a) {
         result = 1;

         for (b = 0; b < 2; ++b) {
            result *= a;

            System.out.println(result);

            if (result == stop) {
               break;
            }
         }

         if (result == stop) {
            break;
         }
      }
   }
}