#include <iostream>

using namespace std;

/*
CSC-134-1901
M3HW1_Q1 - Vibe Checker
Gold
Brian Crouse
22SEP2024
*/

char getUserInput() {
  char input;
  cout << "(y/n)? ";
  while (input != 'y' && input != 'n') {
    input = getchar();
  }
  return input;
}

int main() {
  cout << "Hiya, I'm シプルプルチ or C++y your personal interactive friend program." << endl;
  cout << "Would you like to know what I can do?" << endl;
  //I know this is the assignment, but not using json data or a table for this in lieu of a forever nested structure gives me depression.
  if (getUserInput() != 'n') {
    cout << "Awesome, I just respond to yes or no prompts as you communicate with me. ^(v^ )" << endl;
    cout << "Are you having a good day? o(vo ?)" << endl;
    if (getUserInput() == 'y') {
      cout << "Awesome, I'm glad to hear! l(^o^)7\nI hope you keep thriving, I gotta go!" << endl;
    }
    else {
      cout << "Awe, is it something you can handle by yourself? @(x@ )";
      if(getUserInput() == 'y') {
        cout << "That's good, soldier on o(^-^)7\nI'll see you around." << endl;
      }
      else {
        cout << "Oh-no, have you shared this with anyone? e(_e#)" << endl;
        if (getUserInput() == 'y') {
          cout << "I hope that helped, if not you should consult your support group or maybe a therapist. o(Ao')" << endl;
        }
        else {
          cout << "I'm at the extent of what I can do for you, but you should consult your support group or even a therapist.\nBe safe <3/^(-^ )" << endl;
        }
      }
    }
  }
  else {
    cout << "I didn't enjoy talking to you anyways. >(w<; ) ... Bye!" << endl;
  }

  return 0;
}