import java.util.Scanner;

public class PositiveIntegers {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numIn;
      /* Additional variable declarations go here */
      Boolean allPositive = false;
      numIn = scnr.nextInt();
      for (int i = 0; i < numIn; i += 1) {
        int currentNum = scnr.nextInt();
        allPositive = currentNum > 0 ? true : false;
      }

      if (allPositive) {
         System.out.println("All match");
      }
      else {
         System.out.println("Not all match");
      }
   }
}