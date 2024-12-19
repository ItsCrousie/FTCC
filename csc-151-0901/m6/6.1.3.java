import java.util.Scanner;

public class CalcPyramidVolume {

   /* Your solution goes here  */

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      double userLength;
      double userWidth;
      double userHeight;

      userLength = scnr.nextDouble();
      userWidth = scnr.nextDouble();
      userHeight = scnr.nextDouble();

      System.out.println("Volume: " + pyramidVolume(userLength, userWidth, userHeight));
   }
}