/*
CSC-134-1901
M6T2 - Gold
Brian Crouse
08Dec2024
*/

#include <iostream>
//Please put these in the same directory... since <> didn't work beacuse they're not in the h-files directory.
#include "box.h"
#include "rectangle.h"

using namespace std;

int main() {
  Rectangle Letter;
  Letter.setWidth(8.5);
  Letter.setLength(11);

  cout << "U.S. Letter paper has: " << Letter.getArea() << " sq in of area." << endl;

  Box Amazon_Box;
  Amazon_Box.setLength(8);
  Amazon_Box.setWidth(5);
  Amazon_Box.setHeight(3);

  cout << "Amazon Boxes can fit: " << Amazon_Box.getVolume() << " cu in worth of junk." << endl;
}

