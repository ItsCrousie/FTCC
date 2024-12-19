import java.util.Scanner;

public class ToolBoxInfo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int toolCount;

      toolCount = scnr.nextInt();

      if (toolCount <=  0) {
        System.out.println("Invalid number");
      }
      else if (toolCount > 0 && toolCount <= 9) {
        System.out.println("Medium tool box");
      }
      else if (toolCount > 9 && toolCount <= 26) {
        System.out.println("Full-sized tool box");
      }
      else if (toolCount > 26) {
        System.out.println("Too many for one box");
      }
   }
}