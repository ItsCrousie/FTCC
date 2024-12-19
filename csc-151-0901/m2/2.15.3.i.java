import java.util.Scanner;

public class SentenceFromStrings {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String myName;
      String courseName;

      myName = scnr.next();
      courseName = scnr.next();

      /* Your code goes here */
      System.out.println(myName + " is taking " + courseName + ".");
   }
}