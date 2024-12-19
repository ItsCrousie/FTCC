import java.util.Scanner;

public class ShoesData {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int pairsOfBoots;
      int pairsOfSandals;
      int totalPairs;

      pairsOfBoots = scnr.nextInt();
		pairsOfSandals = scnr.nextInt();

      /* Your code goes here */
      pairsOfBoots = pairsOfBoots * 2;
      pairsOfSandals = pairsOfSandals + 4;
      totalPairs = pairsOfBoots + pairsOfSandals;

      System.out.println(pairsOfBoots + " pairs of boots");
      System.out.println(pairsOfSandals + " pairs of sandals");
      System.out.println(totalPairs + " total");
   }
}