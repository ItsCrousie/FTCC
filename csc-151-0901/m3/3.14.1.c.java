import java.util.Scanner;

public class AppendString {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userName;
      String lastName;

      userName = scnr.nextLine();
      lastName = scnr.nextLine();

      userName += "-" + lastName;

      System.out.println(userName);
   }
}