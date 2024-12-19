import java.util.Scanner;

public class MathFunctions {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double g;
      double h;
      double val;

      g = scnr.nextDouble();
      h = scnr.nextDouble();

      /* Your code goes here */
      val = Math.pow(Math.sqrt(g), Math.sqrt(h));

      System.out.printf("%.1f\n", val); // Outputs val with 1 decimal place
   }
}