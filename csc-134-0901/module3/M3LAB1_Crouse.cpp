#include <iostream>
#include <string>
#include <random>

using namespace std;

/*
CSC-134-1901
M3LAB1
Brian Crouse
16SEP2024
*/


//I had no idea you had to do this in C++, because in JS any function just gets hoisted to the top and memory allocated in one step.
void generateRoomType();

int main() {
  int choice;
  cout << "Do you choose Door 1 or Door 2?" << endl;
  while (choice != 1 && choice != 2) {
    cout << "Type 1 or 2: ";
    cin >> choice;
  }

  //I had so much more planned than two choices, but physics hw came up and that all went to tech-debt. <(＿　＿)>
  if (choice == 1) {
    generateRoomType();
  }
  else if (choice == 2) {
    generateRoomType();
  }

  cout << "Thank you for playing!" << endl;
  return 0;
}

//RNG pick which type of room:
void generateRoomType() {
  //I want four different types of rooms
  srand(static_cast<unsigned int>(time(0)));
  int roomType = rand() % 3 + 1;
  if (roomType == 1) {
    cout << "You found a treasure chest!" << endl;
  }
  else if (roomType == 2) {
    cout << "You find an empty room please continue." << endl;
  }
  else if (roomType == 3) {
    cout << "An army of goblins attacks you as soon as you open the door.";
  }
  else {
    cout << "You find an empty room." << endl;
  }
}
