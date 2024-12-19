import java.util.Scanner;

public class MileData {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_ELEMENTS = 10;
      int[] averageScores = new int[NUM_ELEMENTS];
      int i;

      for (i = 0; i < averageScores.length; ++i) {
         averageScores[i] = scnr.nextInt();
      }

      for (i = averageScores.length - 1; i >= 0; i -= 1) {
         if (i != 0) {
           System.out.printf("%d, ",averageScores[i]);
         } else {
            System.out.printf("%d", averageScores[i]);
         }
      }      for (i = averageScores.length - 1; i >= 0; --i) {
         System.out.printf("%d, ",averageScores[i]);
      }

      System.out.println();
   }
}