import java.util.Scanner;

public class LabProgram {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int highwayNumber = scnr.nextInt();
    //if highwayNumber is aux, it has three digits, otherwise it's primary
    int numLength = Integer.toString(highwayNumber).length();
    String highwayType = numLength == 3 ? "auxiliary" : "primary";

    //if primary number ends in even e/w else n/s
    int primaryNumber = numLength == 3 ? highwayNumber % 100 : highwayNumber;
    String direction = primaryNumber % 2 == 0 ? "east/west" : "north/south";

    if (highwayNumber < 1 || highwayNumber > 999 || primaryNumber == 00) {
      System.out.printf("%d is not a valid interstate highway number.\n", highwayNumber);
    }
    else if (highwayType == "auxiliary") {
      System.out.printf("I-%d is %s, serving I-%d, going %s.\n", highwayNumber, highwayType, primaryNumber, direction);
    }
    else {
      System.out.printf("I-%d is %s, going %s.\n", highwayNumber, highwayType, direction);
    }
  }
}