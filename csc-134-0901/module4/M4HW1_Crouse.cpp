#include <iostream>

using namespace std;

/*
CSC-134-1901
M4THW1 - GOLD
Brian Crouse
10OCT2024
*/

int main () {
  int userNum;
  //prompt user
  while (userNum < 0 || userNum > 12) {
    cout << "Please enter a starting number for your times table: ";
    cin >> userNum;
  }
  //render table
  for (int i = 1; i <= 12; i += 1) {
    cout << userNum << " times " << i << " is " << (userNum * i) << endl;
  }
  return 0;
}