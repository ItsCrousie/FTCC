#include <iostream>
#include <vector>
#include <string>

using namespace std;

/*
CSC-134-1901
M1HW1 - Movie Talk
Brian Crouse
20Aug24
*/

//Basically TS's Interface
  //All this just to make an object -(_-#)
struct Quote {
    string character;
    string line;
};

int main () {
  const string title = "The Matrix";
  const string releaseDate = "March 31, 1999";
  const string gross = "$467 million";
  const string summary = "The Matrix is a dystopian sci-fi film where a computer hacker discovers that reality is a simulated world controlled by machines, leading him to join a rebellion to free humanity.";

  //Print movie info
  cout << title << " was released " << releaseDate << " and grossed approximately " << gross << ".\n\n";
  cout << "About:\n" << summary << "\n\n";

  //Print Quotes
  cout << "Some quotes from the movie are:\n";

  //Vector is like TS array, auto resizes to fit
  vector<Quote> quotes = {
    {"Neo", "There is no spoon."},
    {"Morpheus", "What if I told you that everything you know is a lie?"},
    {"Agent Smith", "Human beings are a disease, and we are the cure."}
  };

  for (Quote quote : quotes) {
    //this is an absolute disaster, surely there's a better way...
      // I researched this and printf exists as a C .h file, but it's not typesafe. - Wack.
    cout << "\"" << quote.line << "\"" << " - " << quote.character << endl;
  }

  return 0;
}