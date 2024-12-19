import java.util.Scanner;

public class IfElse {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numDominantCompanies;

      numDominantCompanies = scnr.nextInt();

      if (numDominantCompanies == 2) {
        System.out.println("Duopoly");
      }
      else {
        System.out.println("Not a duopoly");
      }
   }
}