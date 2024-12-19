import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbers {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random randGen = new Random();
      int seedVal;
      int sum;
      int limitValue;
		int data1;
		int data2;
		int data3;
		int data4;
		int data5;

      seedVal = scnr.nextInt();
      limitValue = scnr.nextInt();

      randGen.setSeed(seedVal);

      /* Your code goes here */
    data1 = randGen.nextInt(limitValue);
		data2 = randGen.nextInt(limitValue);
		data3 = randGen.nextInt(limitValue);
		data4 = randGen.nextInt(limitValue);
		data5 = randGen.nextInt(limitValue);

		sum = data1 + data2 + data3 + data4 + data5;

		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
		System.out.println(data5);
		System.out.println("Sum: " + sum);
   }
}