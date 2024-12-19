import java.util.Scanner;

public class NestedLoops {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startInput;
      int endInput;
      int count;
      int i;
      int j;

      startInput = scnr.nextInt();
      endInput = scnr.nextInt();

      count = 0;
      for (i = 0; i < startInput; i += 1) {
			for (j = 0; j < endInput; ++j) {
            ++count;
         }
      }

      System.out.println("Inner loop ran " + count + " times");
   }
}