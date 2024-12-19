import java.util.Scanner;

public class SimonSays {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String simonPattern;
      String userPattern;
      int userScore;
      int i;

      userScore = 0;

      simonPattern = scnr.next();
      userPattern  = scnr.next();

      for (i = 0; i < userPattern.length(); i += 1) {
        if (!(userPattern.charAt(i) == simonPattern.charAt(i))) {
          break;
        }
        userScore += 1;
      }

      System.out.println("userScore: " + userScore);

      return;
   }
}