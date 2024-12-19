import java.util.Scanner;

public class TaxRanges {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int salaryNum;

      salaryNum = scnr.nextInt();

      if (salaryNum >= 42000 && salaryNum <= 89000) {
        System.out.println("24% tax bracket");
      } else {
        System.out.println("Different tax bracket");
      }
   }
}