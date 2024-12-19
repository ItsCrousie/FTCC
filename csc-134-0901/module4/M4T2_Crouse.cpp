#include <iostream>

using namespace std;

/*
CSC-134-1901
M4T1
Brian Crouse
29SEP2024
*/

int main() {
  int teamPlayers, players;
  const int MIN_PLAYERS = 5, MAX_PLAYERS = 11;

  cout << "How many players do you wish per team? ";
  cin >> teamPlayers;

  while (teamPlayers < MIN_PLAYERS || teamPlayers > MAX_PLAYERS) {
    cout << "You should have at least " << MIN_PLAYERS << " but no more than " << MAX_PLAYERS << " per team.\n";

    cout << "How many players do you wish per team? ";
    cin  >> teamPlayers;
  }

  cout << "How many players are availible? ";
  cin >> players;

  while (players <= 0) {
    cout << "Please enter 0 or greater: ";
    cin >> players;
  }

  return 0;
}