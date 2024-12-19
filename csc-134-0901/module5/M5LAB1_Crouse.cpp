#include <iostream>
using namespace std;

/*
CSC 134
M5LAB1 - Choose Your Own Adventure
Brian Crouse
03NOV2024

Story Branches:
Driveway (Home)
  Main Menu
Front Door
  Dog Attack
    Counter
    Flee
Back Door

*/

// Function Prototypes
// Any functions you make will need to
// be listed here, in this format, at the top.
// This is so the compiler knows to save
// room for them in the final program.
void main_menu();
int choose();
void reslove_choice(void (*choice1)(), void (*choice2)(), void (*choice3)(), void (*choice4)(), int choice);
void choice_front_door();
void choice_back_door();
void choice_steal_pie();
void choice_go_home();
void choice_enter_house();
void choice_kick_dog();
// TODO: add more choices here

int main() {
  cout << "M5LAB1 - Choose Your Own Adventure" << endl;
  // load up the main menu
  main_menu();
  // when we return here, we're done
  cout << "Thanks for playing!" << endl;
  return 0; // finished with no errors
}

void main_menu() {
  // Write a simple menu that lets the user choose 1,2, or 3, or 4 to quit.
  cout << "Main Menu" << endl;
  cout << "You're in front of a spooky old house..." << endl;
  cout << "Do you:" << endl;
  cout << "1. Try the front door" << endl;
  cout << "2. Sneak around back" << endl;
  cout << "3. Forget it, and go home" << endl;
  cout << "4. [Quit]" << endl;
  reslove_choice(choice_front_door, choice_back_door, choice_go_home, main_menu, choose());
}

// FUNCTION DEFINITIONS
// OK, we have the prototypes at the top, but
// now we have to actually write the functions.
// They go here, after main().
int choose() {
  cout << "Choose:" << endl;
  int choice;
  do {
    cin >> choice;
  } while (choice < 1 && choice > 4);
  return choice;
}

void reslove_choice(void (*choice1)(), void (*choice2)(), void (*choice3)(), void (*choice4)(), int choice) {
  //Pick whichever of the three options provided
  switch (choice) {
    case 1:
      choice1();
      break;
    case 2:
      choice2();
      break;
    case 3:
      choice3();
      break;
    case 4:
      choice4();
      break;
    default:
      cout << "Invalid Choice, try again.";
  }
}

void choice_front_door() {
  cout << "Try the front door." << endl;
  cout << "It's locked. " << endl;
  cout << "Do you:" << endl;
  cout << "1. Check around back" << endl;
  cout << "2. Give up and go home" << endl;
  cout << "3. Kick in the door" << endl;
  cout << "4. [Quit]" << endl;
  reslove_choice(choice_back_door, choice_go_home, choice_enter_house, main_menu, choose());
}

void choice_enter_house() {
  cout << "You loudly kick the door in with all your might." << endl
       << "It springs open and at the same time you see a dog jump at you." << endl
       << "Do you:" << endl
       << "1. Kick the dog." << endl
       << "2. Attempt to dodge the dog and run back to the car." << endl
       << "3. Run out the front door and too the back of door of the house." << endl
       << "4. [Quit]." << endl;
  reslove_choice(choice_kick_dog, choice_go_home, choice_back_door, main_menu, choose());
}

void choice_kick_dog() {
  cout << "With the same power you used to kick the large maple door open, you kick the tiny chihuahua, sending it sailing across the living room with a whimper." << endl
      << "You feel horrible, as you should, and chose to leave." << endl;
  main_menu();
}

void choice_back_door() {
  cout << "You sneak around back and enter." << endl
       << "Before you on the kitchen counter is a fresh apple pie." << endl;
  cout << "Do you:" << endl;
  cout << "1. Steal the Apple Pie." << endl;
  cout << "2. [--Tech Debt--]" << endl;
  cout << "3. Leave it and go home." << endl;
  cout << "4. [Quit]" << endl;
  reslove_choice(choice_steal_pie, main_menu, choice_go_home, main_menu, choose());
}

void choice_steal_pie() {
  cout << "You steal the delicious apple pie, mission complete." << endl;
  main_menu();
}

void choice_go_home() {
  cout << "You go back to your car in the driveway." << endl;
  main_menu();
}