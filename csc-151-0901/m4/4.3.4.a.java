import java.util.Scanner;

public class TasksCompleted {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInt = scnr.nextInt();

      String outMsg;
      while (userInt != -1) {
        outMsg = userInt >= 90 ? "On track" : "Needs catching up";
        System.out.println(outMsg);
        userInt = scnr.nextInt();
      }
   }
}