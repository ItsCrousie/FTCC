import java.util.Scanner;

public class MinimumValues {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputVal;
      int minimumVal = 0;
      int i;

      for (i = 0; i < 9; i += 1) {
        inputVal = scnr.nextInt();
        if (i == 0 || inputVal < minimumVal) {
          minimumVal = inputVal;
        }
      }

      System.out.println(minimumVal);
   }
}