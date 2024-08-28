#include <iostream>
#include <string>
using namespace std;

/*
CSC 134 - 1901
M1T2 - Hello, Student
Brian Crouse
20AUG2024
*/

int main() {
  string username;
  string major;
  string hobby;

  cout << "What's your name?\n";
  getline(cin, username);

  cout << "What program are you enrolled in?\n";
  getline(cin, major);

  cout << "What is your favorite past time?\n";
  getline(cin, hobby);

  cout << "Hi, " << username << ".\nGood luck in " << major << ".\nHave fun with " << hobby << endl;
  return 0;
}