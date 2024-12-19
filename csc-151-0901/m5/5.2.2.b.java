import java.util.Scanner;

public class UserData {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numVals;
      int[] userCounts;
      int i;

      numVals = scnr.nextInt();

      userCounts = new int[numVals];
      for (i = 0; i < userCounts.length; ++i) {
			userCounts[i] = scnr.nextInt();
		}

		int sumVals = 0;

      int first = userCounts[0];
      int middle = userCounts[userCounts.length / 2];
      sumVals = first + middle;

      System.out.println(sumVals);
   }
}