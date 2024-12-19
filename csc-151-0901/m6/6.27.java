import java.util.Scanner;

public class LabProgram {

  public static double jiffiesToSeconds(double userJiffie) {
    return userJiffie / 100.0;
  }

  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    double userIn = scnr.nextDouble();

    System.out.printf("%.3f\n", jiffiesToSeconds(userIn));
  }
}
