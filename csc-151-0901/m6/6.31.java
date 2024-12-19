import java.util.Scanner;
import java.util.Random;

public class LabProgram {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    Random rand = new Random(2); // Unique seed

    int userIn = scnr.nextInt();
    int count = 0;
    do {
      System.out.println(coinFlip(rand));
      count += 1;
    } while (count < userIn);
  }

  public static String coinFlip(Random rand) {
    int result = rand.nextInt(2);
    return (result == 1) ? "Heads" : "Tails";
  }
}
