import java.util.Scanner;

public class BikeResearch {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numBikes;

      numBikes = scnr.nextInt();

      if (numBikes < 15) {
        System.out.println("A good number of bikes");
      }
   }
}