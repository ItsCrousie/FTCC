import java.util.Scanner;

public class EmployeeInfo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
		final int NUM_VALS = 5;
		int startingNum;
      int i;

		startingNum = scnr.nextInt();

      int[NUM_VALS] employeeNumbers;
      for (i = 0; i < NUM_VALS; i += 1) {
        employeeNumbers[i] = startingNum - i;
      }

      System.out.print("Employee numbers: ");
      for (i = 0; i < employeeNumbers.length; ++i) {
         System.out.print(employeeNumbers[i] + " ");
      }
      System.out.println();
   }
}