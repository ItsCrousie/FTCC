import java.util.Scanner;

public class MultIfElse {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int musicianCount;

      musicianCount = scnr.nextInt();

      /* Your code goes here */
      if (musicianCount == 2) {
        System.out.println("Duo");
      }
      else if (musicianCount == 3) {
        System.out.println("Trio");
      }
      else if (musicianCount == 5) {
        System.out.println("Quintet");
      }
      else {
        System.out.println("Other number of musicians");
      }
   }
}