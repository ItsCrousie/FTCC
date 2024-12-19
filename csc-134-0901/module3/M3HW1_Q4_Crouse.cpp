#include <iostream>

using namespace std;

/*
CSC-134-1901
M3HW1_Q4 - Math Practice
Gold
Brian Crouse
22SEP2024
*/

int main() {
  //generate random number:
    //seed with time, because then they aren't the same every time you run the program
  srand(static_cast<unsigned int>(time(0)));
  int num1 = rand() % 10 + 1;
  int num2 = rand() % 10 + 1;
  int sum = num1 + num2;
  int userSubmission;

  cout << "What is the sum of " << num1 << " and " << num2 << "?\n";
  cin >> userSubmission;

  while (userSubmission != sum) {
    cout << "Try again!" << endl;
    cin >> userSubmission;
  }
  cout << "Good job, you got it!" << endl;
  return 0;
}
