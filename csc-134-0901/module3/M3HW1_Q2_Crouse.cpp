#include <iostream>
#include <iomanip>
#include <string>

using namespace std;

/*
CSC-134-1901
M3HW1_Q2 - Calculator
Gold
Brian Crouse
22SEP2024
*/

int main() {
  //Prices
  cout << "Please enter the total meal price: ";
  double mealPrice;
  cin >> mealPrice;
  const double taxPercent = 8;
  const double tipPercent = 0.15;

  //Calc Totals
  double tip = mealPrice * tipPercent;
  const double taxAmount = mealPrice * (taxPercent / 100);
  double total = mealPrice + taxAmount + tip;

  cout << "Is this order: 1 - \'Dine In\' or 2 - \'To-go\': ";
  int userChoice;
  cin >> userChoice;
  //Bad practice, but I spent so much time on Q1 I'm too lazy to verify input.
  string orderType = (userChoice == 1) ? "        Dine-In" : "        To-go";

  cout << "______________________\n" << orderType << endl << "______________________\n";
  //I should really learn how to right-align the prices to make this look decent.
  cout << fixed << setprecision(2);
  cout << "Price: $" << mealPrice << endl;
  cout << "Tax: $" << taxAmount << endl;
  cout << "Tip: $" << tip << endl;
  cout << "Total: $" << total<< endl;
  return 0;
}
