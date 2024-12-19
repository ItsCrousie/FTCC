import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int currentPrice;
      int lastMonthsPrice;

      currentPrice = scnr.nextInt();
      lastMonthsPrice = scnr.nextInt();

      int difference = currentPrice - lastMonthsPrice;
      double monthly = (currentPrice * 0.051) / 12;
      System.out.println("This house is $" + currentPrice + ". The change is $" + difference + " since last month.\nThe estimated monthly mortgage is $" + monthly + ".");
   }
}
