import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int _WEIGHTS_ = 5;
      double sum = 0.0;
      double average  = 0.0;
      double maxWeight = 0.0;
      double[] userWeights = new double[_WEIGHTS_];

      int i = 0;
      while (i < userWeights.length) {
        System.out.printf("Enter weight %d:\n", i + 1);

        userWeights[i] = scnr.nextDouble();

        sum += userWeights[i];

        average = sum / (double)i;

        if (userWeights[i] > maxWeight) {
          maxWeight = userWeights[i];
        }
        i += 1;
      }

      String entered = "You entered: ";
      for (int j = 1; j < userWeights.length; j += 1) {
        entered += Double.toString(userWeights[j]) + " ";
      }
      System.out.println(entered + "\n");
      System.out.printf("Total weight: %.1f\nAverage weight: %f\nMax weight: %.1f\n", sum, average, maxWeight);
   }
}
