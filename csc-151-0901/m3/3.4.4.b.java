import java.util.Scanner;

public class CapacityInfo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numItems;
      int boxCapacity;

      numItems = scnr.nextInt();
      boxCapacity = scnr.nextInt();

      if (numItems <= 10) {
        boxCapacity -= 10;
      }

      System.out.println(boxCapacity);
   }
}