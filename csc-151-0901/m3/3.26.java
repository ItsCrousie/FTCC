import java.util.Scanner;

public class LabProgram {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int userCents = scnr.nextInt();

    if (userCents == 0) {
      System.out.println("No change");
    }

    final int[] coinValues = {100, 25, 10, 5, 1};
    final String[] coinNames = {"Dollars", "Quarters", "Dimes", "Nickels", "Pennies"};
    int[] coinQty = {0, 0, 0, 0, 0};

    //use remainder by coin to subtract currentCoins from total
    for (int i = 0; i < coinValues.length; i += 1) {
      coinQty[i] = userCents / coinValues[i];
      userCents = userCents % coinValues[i];
    }

    for (int j = 0; j < coinQty.length; j += 1) {
      String coinQuanity = coinQty[j] + " " + singularize(coinQty[j], coinNames[j]);
      if (coinQty[j] > 0) {
        System.out.println(coinQuanity);
      }
      continue;
    }
  }

  public static String singularize(int coinNum, String coinName) {
    if (coinNum == 1 && coinName == "Pennies") {
      return "Penny";
    }
    else if (coinNum == 1) {
      String singularCoin = coinName.substring(0, coinName.length() - 1);
      return singularCoin;
    }
    return coinName;
  }
}
