
import java.util.Scanner;

public class BreakAndContinue {
   public static void main(String [] args){
      Scanner scnr = new Scanner(System.in);
      int a;
      int b;
      int c;

      a = scnr.nextInt();
      b = scnr.nextInt();
      c = scnr.nextInt();

      while (a < b) {
         System.out.println(a);

         if (a > c) {
            break;
        }

        a += 5;
      }
   }
}