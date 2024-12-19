import java.util.Scanner;

public class ChildDistribution {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numKidsA;
		int numKidsB;
      int numGroups;
      double averageGroups;

      numKidsA = scnr.nextInt();
		numKidsB = scnr.nextInt();
      numGroups = scnr.nextInt();

      /* Your code goes here */
      averageGroups = ((double)numKidsA + (double)numKidsB) / numGroups;

      System.out.println(averageGroups);
   }
}