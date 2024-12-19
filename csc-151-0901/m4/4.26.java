import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int x1 = scnr.nextInt();
      int y1 = scnr.nextInt();
      int z1 = scnr.nextInt();
      int x2 = scnr.nextInt();
      int y2 = scnr.nextInt();
      int z2 = scnr.nextInt();
      int i;
      int j;
      Boolean solved = false;

      for (i = -10; i <= 10; i += 1) {
        for (j = -10; j <= 10; j += 1) {
          if (solve(i, x1, j, y1) == z1 && solve(i, x2, j, y2) == z2) {
            solved = true;
            System.out.printf("x = %d, y = %d\n", i, j);
            break;
          }
        }
      }
      if (!solved) {
        System.out.println("There is no solution");
      }
    }

    public static int solve(int value1, int x, int value2, int y) {
      return (value1 * x) + (value2 * y);
    }
}