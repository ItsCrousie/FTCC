#include <iostream>
#include <iomanip>
#include <string>
#include <cstdlib>

using namespace std;

/*
CSC-134-1901
M2HW1 - Gold
Brian Crouse
28AUG2024
*/

int banker() {
  double balance, depositAmount, withdrawalAmount;
  string userName;
  int accountNumber = rand();

  //Get user info
  cout << "Enter Username (Ex.: Jane Doe)" << endl;
  getline(cin, userName);
  //If the world worked like this I wouldn't have to be in school... (ノω<。)
  cout << "Enter your starting balance in dollars (Ex.: 1.39):" << endl;
  cin >> balance;
  cout << "Enter how much you would like to deposit in dollars (Ex.: 1.39):" << endl;
  cin >> depositAmount;
  cout << "Enter how much you would like to withdraw (Ex. 1.38):" << endl;
  cin >> withdrawalAmount;

  balance = balance + depositAmount - withdrawalAmount;

  //Render reciept
  cout << "Hello, " << userName << "!" << endl;
  cout << "Account Number: " << accountNumber << endl;
  cout << "Balance: $" << fixed << setprecision(2) << balance << endl;

  return 0;
}

/*See M2HW1_Question 2_Crouse.cpp and M2HW1_Question 2_Crouse.png for Question 2*/

//Question 3
int pizzaParty() {
  int pizzasOrdered,
      slicesPerPizza,
      visitors,
      slicesNeeded,
      slicesOrdered;
  const int SLICES_PER_VISITOR = 3;

  //Ask how many pizzas you order
  cout << "How many pizzas will you order?" << endl;
  cin >> pizzasOrdered;
  //Ask how many slices a pizza has
  cout << "How many slices come per pizza?" << endl;
  cin >> slicesPerPizza;
  //Ask how many visitors are coming
  cout << "How many visitors are you hosting?" << endl;
  cin >> visitors;

  //calculate slicesNeeded
  slicesNeeded = visitors * SLICES_PER_VISITOR;
  //calculate slicesOrdered
  slicesOrdered = pizzasOrdered * slicesPerPizza;

  //Display
  if (slicesOrdered < slicesNeeded) {
    cout <<"Order more pizza for your party." << endl;
  }
  else if (slicesNeeded == slicesOrdered) {
    cout << "You'll have just enough pizza for everyone!" << endl;
  }
  else {
    cout << "You will have " << slicesOrdered - slicesNeeded << " slices left over." << endl;
  }

  return 0;
}

//Question 4
int cheerMachine() {
  string letsGo,
         school,
         team,
         cheerOne,
         cheerTwo;
  letsGo = "Let's go ";
  //Real loyalties ;P
  school = "NCSU";
  team = "Wolfpack";

  //Concatnate
  cheerOne = letsGo + school;
  cheerTwo = letsGo + team;

  int chants = 0;
  while (chants < 3) {
    cout << cheerOne << endl;
    ++chants;
  }
  cout << cheerTwo << endl;

  return 0;
}

int main() {
  cout << "Question 1.)\n";
  banker();
  cout << "\nFor Question 2.) Please See M2HW1_Question 2_Crouse.cpp/.png\n";
  cout << "\nQuestion 3.)\n";
  pizzaParty();
  cout << "\nQuestion 4.)\n";
  cheerMachine();
  return 0;
}