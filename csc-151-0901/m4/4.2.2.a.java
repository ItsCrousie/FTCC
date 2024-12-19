import java.util.Scanner;

public class InputReader {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char in;

      in = scnr.next().charAt(0);

      while (in != 's') {
         System.out.println("User entered " + in);
         in = scnr.next().charAt(0);
      }

      System.out.println("Loop terminated");
   }
}