import java.util.Scanner;

public class Suitcase {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int suitcaseSize;

      suitcaseSize = scnr.nextInt();

      if (suitcaseSize < 49) {
        System.out.println("Too lightweight");
      }
      else if (suitcaseSize >= 49 && suitcaseSize < 124) {
        System.out.println("Checkable");
      } else if (suitcaseSize >= 124) {
        System.out.println("Too big");
      }
   }
}