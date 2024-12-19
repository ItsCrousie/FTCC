import java.util.Scanner;

public class CharMatch {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String inputString;

      inputString = scnr.nextLine();

      if (inputString.charAt(4) == 'w') {
        System.out.println("Matching");
      }
      else {
        System.out.println("Not matching");
      }
   }
}