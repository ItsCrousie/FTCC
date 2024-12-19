import java.util.Scanner;

public class FindCharacter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String wordString;
      int index;

      wordString = scnr.next();

      for (int i = 0; i < wordString.length(); i += 1) {
        char currentChar = wordString.charAt(i);
        if (currentChar == 'z') {
          System.out.printf("First occurrence of character \'z\' is at index %d.\n", i);
          return;
        }
      }
      System.out.println("Character \'z\' is not found.");
   }
}