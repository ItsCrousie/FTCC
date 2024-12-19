import java.util.Scanner;

public class FullName {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String firstName;
      String lastName;

      /* Your code goes here */
      firstName = scnr.next();
      lastName = scnr.next();

      System.out.println(lastName + ", " + firstName);
   }
}