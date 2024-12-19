import java.util.Scanner;

public class CuboidVolume {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Your code goes here */
      double cuboidLength = scnr.nextDouble();
      double cuboidWidth = scnr.nextDouble();
      double cuboidHeight = scnr.nextDouble();
      double cuboidVolume = cuboidLength * cuboidWidth * cuboidHeight;

      System.out.printf("Cuboid volume is %.3f\n", cuboidVolume);
   }
}