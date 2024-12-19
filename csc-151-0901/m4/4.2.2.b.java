import java.util.Scanner;

public class SumCalculator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInput;
		int intSum;

		intSum = 0;
		userInput = scnr.nextInt();

    while (userInput <= 0) {
      intSum += userInput;
      userInput = scnr.nextInt();
    }

   	System.out.println(intSum);
	}
}