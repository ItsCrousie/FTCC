#include <iostream>
#include <iomanip>

using namespace std;

/*
CSC-134-1901
M2LAB1 - Profit Boxes
Brian Crouse
28AUG2024
*/

int main() {
  const double COST_PER_CUBIC_FOOT = 0.23;
  const double charge_PER_CUBIC_FOOT = 0.5;
  double l, w, h, volume, cost, charge, profit;

  //Prompt user for input
  cout << "Please enter your intended length in feet (Ex. 0.5)" << endl;
  cin >> l;
  cout << "Please enter your intended width in feet (Ex. 0.5)" << endl;
  cin >> w;
  cout << "Please enter your intended height in feet (Ex. 0.5)" << endl;
  cin >> h;

  //Calculate all the things
  volume = l * h * h;
  cost = volume * COST_PER_CUBIC_FOOT;
  charge = volume * charge_PER_CUBIC_FOOT;
  profit = charge - cost;


  //Display
    //Round for Currency
  cout << fixed << setprecision(2);
  cout << "Your intended volume is: " << volume << endl;
  cout << "Cost to build: $" << cost << endl;
  cout << "Cost to Customer: $" << charge << endl;
  cout << "Profit: $" << profit << endl;

  return 0;
}
