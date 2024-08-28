#include <iostream>
#include <iomanip>
#include <string>

using namespace std;

/*
CSC-134-1901
M2T2 - Apple Sales
Brian Crouse
27AUG2024
*/

int main() {
  string name;
  int numApples;
  double pricePerApple;

  //Solve user inputting full name... in an ideal world.
    //Though about validating with REGEX, but I'm sure we'll learn that later (。_。)
  cout << "Hi, what's your first name?\n";
  cin >> name;

  cout << "How many apples do you have for sale?\n";
  cin >> numApples;

  cout << "Please enter the price per apple in dollars (ex.: 0.25)\n";
  cin >> pricePerApple;

  double totalCost = numApples * pricePerApple;

  cout << "Welcome to " + name + "'s apple store!" << endl;
  cout << "We have " << numApples << " in stock." << endl;
  cout << "Apples cost $" << fixed << setprecision(2) << pricePerApple << "." << endl;
  cout << "The whole stock is $" << fixed << setprecision(2) << totalCost << "." << endl;

  return 0;
}
