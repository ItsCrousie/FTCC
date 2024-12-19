import java.util.Scanner;

public class GroceryList {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String listName;
      String listItem1;
		String listItem2;
		String listItem3;

    /* Your code goes here */
    listName = scnr.nextLine();
    listItem1 = scnr.next();
    listItem2 = scnr.next();
    listItem3 = scnr.next();

		System.out.println(listName + ":");
		System.out.println(listItem1);
		System.out.println(listItem2);
		System.out.println(listItem3);
   }
}