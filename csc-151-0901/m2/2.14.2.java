import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class OutputCombinations {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char a;
      char b;
      char c;

      a = scnr.next().charAt(0);
      b = scnr.next().charAt(0);
      c = scnr.next().charAt(0);

      /* Your solution goes here  */
      //init char array
      char[] characters = {a, b, c};
      //init Set to store unique combos
      Set<String> combos = new HashSet<>();
      //create combos
      generateCombos(characters, 0, "", combos);

      String outputCombos = String.join(", ", combos);

      System.out.println(outputCombos);
   }

   public static void generateCombos(char[] characters, int i, String currentCombo, Set<String> combos) {
      //if you're at the last character --stop
      if (i == characters.length) {
        combos.add(currentCombo);
        return;
      }
      //till then generate a combo
      for (char currentChar : characters) {
        generateCombos(characters, i + 1, currentCombo + currentChar, combos);
      }
   }
}