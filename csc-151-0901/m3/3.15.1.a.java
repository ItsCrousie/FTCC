import java.util.Scanner;

public class StringChecker {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userString;

      userString = scnr.nextLine();

      //the fact you can't just chain userString.charAt(2).isDigit() makes Java reprehensible 🤮.
      if (Character.isDigit(userString.charAt(2))) {
        System.out.printf("The third character is digit: %c\n", (char)userString.charAt(2));
      }
      else {
        System.out.println("The third character is not a digit.");
      }
   }
}