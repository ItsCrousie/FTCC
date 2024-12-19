import java.util.Scanner;

public class TempGrades {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int ARR_VALS = 7;
      int[] hourlyTemps = new int[ARR_VALS];
      int i;

      for (i = ARR_VALS - 1; i >= 0; i -= 1) {
         hourlyTemps[i] = scnr.nextInt();
      }

      for (i = 0; i < hourlyTemps.length; ++i) {
         System.out.print(hourlyTemps[i] + " ");
      }

      System.out.println();
   }
}