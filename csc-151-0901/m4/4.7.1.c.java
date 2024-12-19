import java.util.Scanner;

public class LoopPatterns {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int initialValue;
      int finalValue;
      int i;
      int j;

      initialValue = scnr.nextInt();
      finalValue = scnr.nextInt();

      for (i = initialValue; i <= finalValue; i += 1) {
        for (j = 0; j < i; j += 1) {
          System.out.print("%");
        }
        System.out.println();
      }
   }
}