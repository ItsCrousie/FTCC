import java.util.Scanner;

public class ColonSeparatedValues {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inCount;

      inCount = scnr.nextInt();
      inCount = scnr.nextInt();
      for (int i = 0; i < inCount; i += 1) {
        int currInput = scnr.nextInt();
        if (i == inCount - 1) {
          System.out.print(currInput);
        }
        else {
          System.out.printf("%d: ", currInput);
        }
      }
      System.out.print("\n");
   }
}