#include <iostream>
#include <string>
using namespace std;

/*
CSC 134 - 1901
M1LAB - Apple Orchard
Brian Crouse
20AUG2024
*/

int main() {
  string ownerName = "Brian";

  int apples = 100;

  const double pricePerApple = 0.25;

  // calculate the total price of the apples
    //Note: Cast apples into double just like Java
  double totalPrice = (double)apples * pricePerApple;

  // Print Orchard Info
  cout << "Welcome to " << ownerName << "’s apple orchard." << endl;
  cout << "We have " << apples << " apples in stock." << endl;
  cout << "Apples are currently $" << pricePerApple << " each." << endl;

  // Print total
  cout << "If you want them all, that will be $" << totalPrice << ".\n";

  return 0;
}