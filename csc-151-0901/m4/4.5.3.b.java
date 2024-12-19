import java.util.Scanner;

public class IntegerData {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numInput;
      int currVal;
      Boolean onlyValidValues = true;

      numInput = scnr.nextInt();
      for (int i = 0; i < numInput; i += 1) {
         currVal = scnr.nextInt();
         if (!(currVal >= 90 && currVal <= 100)) {
            onlyValidValues = false;
            break;
         }
      }

      if (onlyValidValues) {
         System.out.println("Only valid value(s)");
      }
      else {
         System.out.println("At least one mismatch");
      }
   }
}