import java.util.Scanner;

public class ExtraSumCalculator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int ARR_LENGTH = 6;
      int[] averageSalaries = new int[ARR_LENGTH];
      int i;
      int sumBonus;

      for (i = 0; i < averageSalaries.length; ++i) {
         averageSalaries[i] = scnr.nextInt();
      }

      sumBonus = 0;
      for (i = 0; i < averageSalaries.length; i += 1) {
        int currentSalary = averageSalaries[i];
        if (currentSalary >= 300) {
          sumBonus += currentSalary - 300;
        }
      }

      System.out.println("Bonus sum: " + sumBonus);
   }
}