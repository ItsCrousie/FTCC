#include <iostream>
#include <string>

using namespace std;

/*
CSC-134-1901
M5T1
Brian Crouse
27OCT2024
*/

string formatAnswer(int answer);
void printAnswer(string msg);

int main() {
  int answer = 5;
  string message;
  message = formatAnswer(answer);
  printAnswer(message);
  return 0;
}

string formatAnswer (int answer) {
  string answerMessage;
  answerMessage = "The answer is ";
  answerMessage += to_string(answer);
  return answerMessage;
}
void printAnswer(string msg) {
  cout << msg << endl;
}