#include <iostream>
#include <string>

using namespace std;

/*
CSC-134-1901
M5T2
Brian Crouse
27OCT2024
*/

//it blows my mind this isn't just auto-hoisted by g++
int square(int num);
void printAnswer(int number, int result);

int main() {
  for (int i = 1; i <= 10; i += 1) {
    printAnswer(i, square(i));
  }

  return 0;
}

int square(int num) {
  return num * num;
}

void printAnswer(int number, int result) {
  cout << number << " squared is " << result << endl;
}