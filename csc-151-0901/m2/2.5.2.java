import java.util.Scanner;

public class RectangleMeasurements {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int height;
      int length;
      int recArea;

      height = scnr.nextInt();
      length = scnr.nextInt();

      /* Your code goes here */
      recArea = height * length;
      System.out.println("Area: " + recArea);
   }
}