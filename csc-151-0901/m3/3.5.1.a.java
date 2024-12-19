import java.util.Scanner;

public class TownPopulation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputPop;

      inputPop = scnr.nextInt();

      // Modify the following line
      if ((inputPop < 1150) || (inputPop > 4150)) {
         System.out.println("Not a small town");
      }
      else {
         System.out.println("Small town");
      }
   }
}