import java.util.Scanner;

public class FindStateField {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String personAndState;
		int index1;

      personAndState = scnr.nextLine();
      int slashIdx = personAndState.indexOf("/");

      System.out.println(personAndState.substring(slashIdx + 1, slashIdx + 3));
   }
}