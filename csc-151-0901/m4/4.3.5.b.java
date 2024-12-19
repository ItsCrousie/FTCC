import java.util.Scanner;

public class PairedDataProcessing {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String inputWord;
      int foodStock;

      inputWord = scnr.next();
      while (!inputWord.equals("Over")){
        foodStock = scnr.nextInt();
        if (foodStock < 45) {
          System.out.println(inputWord + ": reorder soon");
        }
        inputWord = scnr.next();
      }
   }
}