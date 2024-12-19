import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double caffeineMg; // "double" supports floating-point like 75.5, versus int for integers like 75.

      caffeineMg = scnr.nextDouble();

      double caffMgfter6Hrs = caffeineMg / 2;
      double caffMgfter12Hrs = caffMgfter6Hrs / 2;
      double caffMgfter24Hrs = caffMgfter12Hrs / 4;

      System.out.printf("After 6 hours: %.2f mg\n", caffMgfter6Hrs);
      System.out.printf("After 12 hours: %.2f mg\n", caffMgfter12Hrs);
      System.out.printf("After 24 hours: %.2f mg\n", caffMgfter24Hrs);
   }
}
