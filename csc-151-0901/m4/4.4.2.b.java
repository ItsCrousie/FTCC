import java.util.Scanner;

public class CurlyBraces {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numInts;

      numInts = scnr.nextInt();
      scnr.nextInt();
      for (int i = 0; i < numInts; i += 1) {
        int currNum = scnr.nextInt();
        System.out.printf("{%d}", currNum);
      }
      System.out.print("\n");
   }
}