import java.util.Scanner;

public class StringModification {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String inString;
      inString = scnr.nextLine();

      Boolean hasUppercase = false;
      for (int i = 0; i < inString.length(); i++) {
        char currentChar = inString.charAt(i);
        if (!Character.isLetter(currentChar)) {
          continue;
        } else if (Character.toUpperCase(currentChar) == currentChar) {
          hasUppercase = true;
        }
      }

      if (hasUppercase) {
         System.out.println("Valid string");
      }
      else {
         System.out.println("Invalid string");
      }
   }
}