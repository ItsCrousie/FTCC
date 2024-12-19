import java.util.Scanner;

public class InsectGrowth {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numInsects;

      numInsects = scnr.nextInt(); // Must be >= 1
      if (numInsects < 200) {
        System.out.print(numInsects + " ");
      }

      while (numInsects > 0 && numInsects < 200) {
        numInsects *= 2;
        if (numInsects < 200) {
          System.out.print(numInsects + " ");
        }
      }
      System.out.print("\n");
   }
}