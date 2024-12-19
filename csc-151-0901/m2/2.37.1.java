import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      final double NICKLE = 0.05;
      final double DIME = 0.1;
      final double QUARTER = 0.25;

      int nickles = scnr.nextInt();
      int dimes = scnr.nextInt();
      int quarters = scnr.nextInt();

      double amount = (NICKLE * nickles) + (DIME * dimes) + (QUARTER * quarters);

      System.out.printf("Amount: $%.2f\n", amount);
    }
}