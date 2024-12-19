import java.util.Scanner;

public class Relational {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inVal;

      inVal = scnr.nextInt();

      if (inVal > -10) {
         System.out.println("More than -10");
      }
      else {
         System.out.println("-10 or less");
      }
   }
}