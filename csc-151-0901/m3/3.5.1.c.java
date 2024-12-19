import java.util.Scanner;

public class TemperatureChecker {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numDegrees;

      numDegrees = scnr.nextInt();

      if (numDegrees < 1761) {
        System.out.println("The silver is now a solid.");
      }
      else if (numDegrees >= 1761 && numDegrees < 3940) {
        System.out.println("The silver is now a liquid.");
      }
      else {
        System.out.println("The silver is now a gas.");
      }
   }
}