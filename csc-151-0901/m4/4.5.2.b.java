import java.util.Scanner;

public class LargestValues {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numIn;
      double inVal;
      double largestVal = 0.0;
      int i;

      numIn = scnr.nextInt();

      for (i = 0; i < numIn; i += 1) {
        inVal = scnr.nextDouble();
        if (i == 0 || Double.compare(inVal ,largestVal) > 0) {
          largestVal = inVal;
        }
        System.out.printf("Value read: %.1f\n", inVal);
      }
      System.out.printf("Largest: %.2f\n", largestVal);
   }
}