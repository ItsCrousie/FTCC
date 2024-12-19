import java.util.Scanner;

public class ChairResearch {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numChairs;

      numChairs = scnr.nextInt();

      if (numChairs > 12) {
        System.out.println("An acceptable number of chairs");
      }
      else {
        System.out.println("Not enough chairs")
      }
   }
}