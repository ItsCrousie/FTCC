#include <iostream>

using namespace std;

/*
CSC-134-1901
M3T1
Brian Crouse
13SEP2024
*/

int main() {
  int width1, lenght1, area1, width2, length2, area2;

  //get input
  cout << "Please enter an integer width for your first rectangle:\n";
  cin >> width1;

  cout << "Please enter an integer length for your first rectangle:\n";
  cin >> lenght1;

  cout << "Please enter an integer width for your second rectangle:\n";
  cin >> width2;

  cout << "Please enter an integer length for your second rectangle:\n";
  cin >> length2;

  //calc areas
  area1 = width1 * lenght1;
  area2 = width2 * length2;

  //render
    //I like how you said you should stay consistent with \n and endl, I just use endl when the output ends in a variable and a newline when the output ends in another string primative.
  cout << "The area of your first rectangle is: " << area1 << endl;
  cout << "The area of your second rectangle is: " << area2 << endl;

  return 0;
}