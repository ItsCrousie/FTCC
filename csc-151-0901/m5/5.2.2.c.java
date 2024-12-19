import java.util.Scanner;

public class UserLog {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numElems;
      int i;

      numElems = scnr.nextInt();
      int[] userNums = new int[numElems];

		for (i = 0; i < userNums.length; ++i) {
			userNums[i] = scnr.nextInt();
		}
		System.out.print("Array contents: ");

    for (int j = 0; j < userNums.length; j += 1) {
			System.out.printf("%d ", userNums[j]);
		}
    System.out.println("");
   }
}