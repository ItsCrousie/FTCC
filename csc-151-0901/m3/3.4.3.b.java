import java.util.Scanner;

public class Relational {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numCents;

      numCents = scnr.nextInt();

      if (numCents >= 100) {
        System.out.println("Max has a dollar or more");
      }
      else {
        System.out.println("Max has less than a dollar");
      }
   }
}
