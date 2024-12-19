import java.util.Scanner;

public class LabProgram {

  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    String firstName = scnr.next();
    String lastName = scnr.next();
    int birthYear = scnr.nextInt();

    String firstSix = firstName.length() >= 6 ? firstName.substring(0, 6) : firstName;
    char lastLetter = lastName.charAt(0);
    int onesYear = birthYear % 10;

    System.out.printf("%s%s_%d\n", firstSix, lastLetter, onesYear);
  }
}
