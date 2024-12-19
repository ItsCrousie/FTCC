import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[9];  // Set of data specified by the user
      int i = 0;
      int userIn;
      boolean keepScanning = true;

      while (i < 9 && keepScanning) {
        userIn = scnr.nextInt();
        if (userIn < 0) {
          keepScanning = false;
        }
        userValues[i] = userIn;
        i += 1;
      }

      if (i > 9) {
        System.out.println("Too many numbers");
      } else {
        System.out.printf("Middle item: %d\n", userValues[Math.floorDiv(i, 2) - 1]);
      }
    }
}