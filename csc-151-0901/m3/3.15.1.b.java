import java.util.Scanner;

public class StringModification {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userString;
      userString = scnr.nextLine();

      //surely this can be done better, but I'll revisit later.
      Boolean containsDigit = (Character.isDigit(userString.charAt(0))) || Character.isDigit(userString.charAt(1)) || Character.isDigit(userString.charAt(2));

      if (containsDigit) {
         System.out.println("String accepted");
      }
      else {
         System.out.println("String not accepted");
      }
   }
}