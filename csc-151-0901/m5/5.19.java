import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int numIntegers = scnr.nextInt();
        int[] integers = new int[numIntegers];

        for (int i = 0; i < numIntegers; i += 1) {
            integers[i] = scnr.nextInt();
        }

        int lowerBound = scnr.nextInt();
        int upperBound = scnr.nextInt();

        for (int i = 0; i < numIntegers; i += 1) {
            if (integers[i] >= lowerBound && integers[i] <= upperBound) {
                System.out.print(integers[i] + ",");
            }
        }
        System.out.println();
    }
}