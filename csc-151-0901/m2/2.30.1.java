import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      long phoneNumber = scnr.nextLong();

      double area = phoneNumber / 10000000;
      double prefix = (phoneNumber / 10000) % 1000;
      double lineNumber = phoneNumber % 10000;

      System.out.printf("(%3.0f) %2.0f-%4.0f\n", area, prefix, lineNumber);
   }
}
