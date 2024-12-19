import java.util.Scanner;

public class CashRecords {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numElements;
		int i;

		numElements = scnr.nextInt();

      /* Your code goes here */

      for (i = 0; i < numElements; ++i) {
			System.out.println("Customer number: " + customerNumbers[i] + ", Paid: $" + tipsPaid[i]);
		}
   }
}