import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int countNum;
      int i;

      Scanner input = new Scanner(System.in);
      countNum = input.nextInt();

      System.out.println("Ready!");
      for (i = countNum; i > 0; i -= 1) {
        System.out.println(i);
      }
      System.out.println("Go!");
   }
}