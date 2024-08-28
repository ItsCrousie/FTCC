#include <iostream>
#include <iomanip>
using namespace std;

/*
CSC-134-1901
M2T1 - Calculator
Brian Crouse
27AUG2024
*/

int main() {
  const double mealPrice = 5.99;
  const double taxPercent = 8;
  const double taxAmount = mealPrice * (taxPercent / 100);
  double total = mealPrice + taxAmount;

  cout << "Price: " << fixed << setprecision(2) << mealPrice << endl;
  cout << "Tax: " << fixed << setprecision(2) << taxAmount << endl;
  cout << "Total: " << fixed << setprecision(2) << total<< endl;
  return 0;
}
