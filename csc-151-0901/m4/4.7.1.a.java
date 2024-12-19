import java.util.Scanner;

public class LoopCounter {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int firstRange;
      int secondRange;
      int count;
      int i;
      int j;

      firstRange = scnr.nextInt();
      secondRange = scnr.nextInt();

      count = 0;
      i = 0;
      while (i <= firstRange) {
			j = 0;
			while (j <= secondRange) {
            ++count;
            ++j;
         }
         ++i;
      }

      System.out.println("Inner loop ran " + count + " times");
   }
}