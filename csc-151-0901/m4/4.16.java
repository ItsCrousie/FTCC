import java.util.Scanner;

public class LabProgram {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int max = 0;
    double total = 0;
    double average = 0;

    int input = scnr.nextInt();
    int inputNums = 1;

    while (input >= 0) {
      //get max
        //I really wish java had undefined because max == 0 seems sketchy
      if (max == 0 || input > max) {
        max = input;
      }
      //Calc AVG
      total += input;
      average = total / (double)inputNums;
      input = scnr.nextInt();
      inputNums += 1;
    }

    System.out.printf("%d %.2f\n",max, average);
  }
}
