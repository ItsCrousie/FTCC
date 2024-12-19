import java.util.Scanner;

public class LabProgram {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    String userIn = scnr.nextLine();


    System.out.println(userIn.replaceAll("[^a-zA-Z]", ""));
  }
}
