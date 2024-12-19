import java.util.Scanner;
import java.util.ArrayList;

public class LabProgram {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    double[] distances = {20, 75, 500};
    ArrayList<Double> costs = new ArrayList<>();
    double mpg = scnr.nextDouble();
    double pricePerGallon = scnr.nextDouble();

    for (double distance : distances) {
      double gallons = distance / mpg;
      double cost = gallons * pricePerGallon;
      costs.add(cost);
    }

    System.out.printf("%.2f %.2f %.2f\n", costs.get(0), costs.get(1), costs.get(2));
  }
}