import java.util.Scanner;

public class StringLength {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String strInput;

      strInput = scnr.nextLine();

      if (strInput.charAt(strInput.length() - 1) == '?') {
        System.out.println("A question");
      }
      else {
        System.out.println("Not a question");
      }
   }
}