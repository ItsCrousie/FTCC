import java.util.Scanner;

public class TimeConverter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int totalYears;
      int numMillennia;
      int numCenturies;
      int numYears;

      totalYears = scnr.nextInt();

      /* Your code goes here */
      numMillennia = (totalYears / 1000) % 10;
      numCenturies = (totalYears / 100) % 10;
      numYears = totalYears % 100;


      System.out.println("Millennia: " + numMillennia);
      System.out.println("Centuries: " + numCenturies);
      System.out.println("Years: " + numYears);
   }
}