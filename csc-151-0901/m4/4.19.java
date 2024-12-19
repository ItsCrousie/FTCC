import java.util.Scanner;

public class LabProgram {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    String userPassword = scnr.next();

    for (int i = 0; i < userPassword.length(); i += 1) {
      char currentChar = userPassword.charAt(i);
      switch (currentChar) {
        case 'i':
          userPassword = userPassword.replace(currentChar, '1');
          break;
        case 'a':
          userPassword = userPassword.replace(currentChar, '@');
          break;
        case 'm':
          userPassword = userPassword.replace(currentChar, 'M');
          break;
        case 'B':
          userPassword = userPassword.replace(currentChar, '8');
          break;
        case 's':
          userPassword = userPassword.replace(currentChar, '$');
          break;
      }
    }
    System.out.println(userPassword.concat("!"));
  }
}
