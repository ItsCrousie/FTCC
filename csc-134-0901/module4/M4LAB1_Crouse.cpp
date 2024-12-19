#include <iostream>

using namespace std;

/*
CSC-134-1901
M4TLAB1
Brian Crouse
10OCT2024
*/

int main () {
  //Prompt for Input
  int blockSize;
  cout << "Please enter the size of the square block you want: ";
  cin >> blockSize;

  //Render Row
  for (int i = 0; i < blockSize; i += 1) {
    //Render Colum
    for (int j = 0; j < blockSize; j += 1) {
      cout << "* ";
    }
    cout << endl;
  }

  return 0;
}