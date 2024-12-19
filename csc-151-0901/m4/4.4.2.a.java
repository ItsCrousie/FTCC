import java.util.Scanner;

public class NumberOfBears {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numIn;
      int value;
      int i;

      numIn = scnr.nextInt();
      for (i = 0; i <= numIn-1; i += 1) {
        value = scnr.nextInt();
        System.out.printf("%d bears\n", value);
      }
   }
}