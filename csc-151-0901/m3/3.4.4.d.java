import java.util.Scanner;

public class GroupResearch {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numParts;
      int requiredGroups;
      int invalidGroups;

      numParts = scnr.nextInt();
      requiredGroups = scnr.nextInt();
      invalidGroups = scnr.nextInt();

      if (numParts <= 17) {
        requiredGroups += 4;
      }
      else {
        invalidGroups -= 2;
      }

      System.out.println(requiredGroups);
      System.out.println(invalidGroups);
   }
}