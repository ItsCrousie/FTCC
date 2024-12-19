import java.util.Scanner;

public class SumValid {
   public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int dataValue;
		int sumValid;

		sumValid = 0;
    dataValue = scnr.nextInt();
    while (dataValue > -10 && dataValue < 35) {
      sumValid += dataValue;
      dataValue = scnr.nextInt();
    }
    System.out.println(sumValid);
  }
}