import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int userNum = scnr.nextInt();
      int divNum = scnr.nextInt();

      int firstDiv = userNum / divNum;
      int secondDiv = firstDiv / divNum;
      int thirdDiv = secondDiv / divNum;

      System.out.println(firstDiv + " " + secondDiv + " " + thirdDiv);
   }
}
