import java.util.Scanner;

public class InputExample {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int birthMonth;
      int birthYear;

      /* Your solution goes here  */
      birthMonth = scnr.nextInt();
      birthYear = scnr.nextInt();
      System.out.println(birthMonth + "/" + birthYear);
   }
}