import java.util.Scanner;

public class OutputWithVars {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;

      System.out.println("Enter integer:");
      userNum = scnr.nextInt();

      /* Type your code here */
      //output user entry, square and cube:
      int userNumSquared = userNum * userNum;
      int userNumCubed = userNum * userNum * userNum;
      System.out.println("You entered: " + userNum);
      System.out.println(userNum + " squared is " + userNumSquared);
      System.out.println("And " + userNum + " cubed is " + userNumCubed + "!!");

      //get second user input:
      int newUserNum;

      System.out.println("Enter another integer:");
      newUserNum = scnr.nextInt();

      //output user entry with sum and product:
      int userSum = userNum + newUserNum;
      int userProd = userNum * newUserNum;
      System.out.println(userNum + " + " + newUserNum + " is " + userSum);
      System.out.println(userNum + " * " + newUserNum + " is " + userProd);
   }
}