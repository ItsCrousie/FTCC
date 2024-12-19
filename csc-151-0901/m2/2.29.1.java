import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double x = scnr.nextDouble();
      double y = scnr.nextDouble();
      double z = scnr.nextDouble();

      double xSqrd = Math.pow(x, z);
      double xPowYPowZ = Math.pow(x, Math.pow(y, z));
      double yAbs = Math.abs(y);
      double xySqrtPowZ = Math.pow(Math.sqrt(x * y), z);
      //I have no idea wether or not they want the output rounded or not, the tests are horrid.
      System.out.printf("%.2f %s %.1f %.1f\n", xSqrd, formatDouble(xPowYPowZ), yAbs, xySqrtPowZ);
   }
   //hacky way to get the + off positive exponents.
   public static String formatDouble (double number) {
      String withoutPosExp = String.format("%.15E", number);
      return withoutPosExp.replace("E+", "E");
   }
}
