import java.util.Scanner;

public class MultIfElse {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numMusicians;

      numMusicians = scnr.nextInt();

      /* Your code goes here */
      if (numMusicians == 1) {
        System.out.println("Solo");
      }
      else if (numMusicians == 2) {
        System.out.println("Duo");
      }
      else {
        System.out.println("Another number of musicians");
      }
   }
}