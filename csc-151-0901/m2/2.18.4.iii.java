import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbers {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random randGen = new Random();
      int seedVal;
		int totalKeychains;
		int minVal;
		int maxVal;
		int bowl1;
		int bowl2;
		int bowl3;

    seedVal = scnr.nextInt();
		minVal = scnr.nextInt();
		maxVal = scnr.nextInt();

    /* Your code goes here */
    randGen.setSeed(seedVal);

    bowl1 = randGen.nextInt((maxVal - minVal) + 1) + minVal;
    bowl2 = randGen.nextInt((maxVal - minVal) + 1) + minVal;
    bowl3 = randGen.nextInt((maxVal - minVal) + 1) + minVal;

    totalKeychains = bowl1 + bowl2 + bowl3;

		System.out.println(bowl1);
		System.out.println(bowl2);
		System.out.println(bowl3);
		System.out.println("Sum: " + totalKeychains);
   }
}