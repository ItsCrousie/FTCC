import java.util.Scanner;

public class ReplaceField {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String templateString;
      String minutesString;
      String timeString;

      templateString = scnr.nextLine();
      minutesString = scnr.next();

      timeString = templateString.replace("[minutes]", minutesString);

      System.out.println(timeString);
   }
}