#include <iostream>

using namespace std;

/*
CSC-134-1901
M4T1
Brian Crouse
29SEP2024
*/

void programFiveThree() {
  cout << "Program 5-3:\n";
  int number = 0;
  while (number < 5) {
    cout << "Hello\n";
    number += 1;
  }
  cout << "That's all!\n\n";
}

void programFiveSix() {
  cout << "Program 5-6:\n";
  const int MIN_NUMBER = 1,
            MAX_NUMBER = 10;

  int num = MIN_NUMBER;

  cout << "Number | Number Squared\n";
  cout << "_______________________\n";

  while (num <= MAX_NUMBER) {
    cout << num << "\t\t" << (num * num) << endl;
    num += 1;
  }
}

int main() {
  programFiveThree();
  programFiveSix();
  return 0;
}