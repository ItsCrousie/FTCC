import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputYear;
      boolean isLeapYear;

      isLeapYear = false;
      inputYear = scnr.nextInt();

      if (inputYear % 4 == 0) {
        isLeapYear = true;
        if (inputYear % 100 == 0 && !(inputYear % 400 == 0)) {
          isLeapYear = false;
        }
      }

      if (isLeapYear) {
        System.out.printf("%d - leap year\n", inputYear);
      }
      else {
        System.out.printf("%d - not a leap year\n", inputYear);
      }
   }
}