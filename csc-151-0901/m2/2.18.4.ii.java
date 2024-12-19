import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbers {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random randGen = new Random();
      int seedVal;
		int minValue;
		int maxValue;
		int pick1;
		int pick2;

    seedVal = scnr.nextInt();
		minValue = scnr.nextInt();
		maxValue = scnr.nextInt();

    randGen.setSeed(seedVal);

    /* Your code goes here */
    pick1 = randGen.nextInt(maxValue - minValue) + minValue;
    pick2 = randGen.nextInt(maxValue - minValue) + minValue;

		System.out.println(pick1);
		System.out.println(pick2);
   }
}