import java.util.Scanner;

public class ResultCalculator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int valueIn;
      int finalNum;

      finalNum = 0;
      valueIn = scnr.nextInt();

      while (valueIn >= 0) {
        finalNum = valueIn % 3 == 0 ? finalNum + valueIn : finalNum - valueIn;
        valueIn = scnr.nextInt();
      }

      System.out.println("Final number is " + finalNum);
   }
}