import java.util.Scanner;

public class JoinMultipleFields {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String list1;
      String list2;
      String list3;
      String combinedColors;
      String allTheItems;

      list1 = scnr.nextLine();
      list2 = scnr.nextLine();
      list3 = scnr.nextLine();

      combinedColors = list1 + list2 + list3;
      //too out of brain juice to come up with a more clever solution... 😓
      allTheItems = list1.replace(")", ",") + list2.replace("(", " ").replace(")", ", ") + list3.replace("(", "");

      System.out.println("All lists in one line: " + combinedColors);
      System.out.println("One list of all colors: " + allTheItems);
   }
}