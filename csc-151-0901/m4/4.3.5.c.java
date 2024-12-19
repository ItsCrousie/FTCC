import java.util.Scanner;

public class Sequencing {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int currentVal;
      int previousVal;

      previousVal = scnr.nextInt();
      currentVal = scnr.nextInt();
      System.out.println("Sequence starts at " + previousVal + ".");

      while (currentVal == previousVal * 5) {
        System.out.printf("%d is 5 times %d. Sequence is increasing geometrically.\n", currentVal, previousVal);
        previousVal = currentVal;
        currentVal = scnr.nextInt();
      }
   }
}