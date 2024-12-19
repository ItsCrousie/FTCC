import java.util.Scanner;

public class SimpleWhileLoop {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
		String inputWord;

		inputWord = scnr.next();

    while (!(inputWord.equals("horses"))) {
      System.out.println("horses not found yet");
      inputWord = scnr.next();
    }

		System.out.println("Found horses!");
   }
}