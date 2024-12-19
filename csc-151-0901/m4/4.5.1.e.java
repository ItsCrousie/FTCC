import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int startNumber;
      int lastNumber;
      int i;

      Scanner input = new Scanner(System.in);
      startNumber = input.nextInt();
      lastNumber = input.nextInt();

      for (i = startNumber; i <= lastNumber; i += 1) {
         System.out.print(i + " ");
      }
   }
}