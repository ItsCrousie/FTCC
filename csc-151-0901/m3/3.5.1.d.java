import java.util.Scanner;

public class ZipcodesCategories {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int zipCode;

      zipCode = scnr.nextInt();

      if (zipCode >= 10000 && zipCode <= 29999) {
        System.out.println("ZIP code for the Eastern US");
      }
      else if (zipCode >= 30000 && zipCode <= 79999) {
        System.out.println("ZIP code for the Central US");
      }
      else if (zipCode >= 80000 && zipCode <= 99950) {
        System.out.println("ZIP code for the Western");
      }
      else {
        System.out.println("Invalid input");
      }
   }
}