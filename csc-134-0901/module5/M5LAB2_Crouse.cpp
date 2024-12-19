
#include <iostream>
#include <iomanip>
using namespace std;

/*
CSC 134
M5LAB1 - Choose Your Own Adventure
Brian Crouse
03NOV2024
*/

double getLength();
double getWidth();
double getArea(double length, double width);
void displayData(double length, double width, double area);


int main()
{
	// This program calculates the area of a rectangle.
	// TODO: fix any syntax errors

   double length,    // The rectangle's length
          width,     // The rectangle's width
          area;      // The rectangle's area

   // Get the rectangle's length.
   length = getLength();

   // Get the rectangle's width.
   width = getWidth();

   // Get the rectangle's area.
   area = getArea(length, width);

   // Display the rectangle's data.
   displayData(length, width, area);

   return 0;
}

//***************************************************
// TODO: write the getLength, getWidth, getArea,    *
// and displayData functions below.                 *
//***************************************************
double getLength() {
  cout << "Enter desired length to two decimal places:" << endl;
  double length;
  cin >> length;
  return length;
}

double getWidth() {
  cout << "Enter desired width to two decimal places:" << endl;
  double width;
   cin >> width;
  return width;
}

double getArea(double length, double width) {
  return length * width;
}

void displayData(double length, double width, double area) {
  cout << setprecision(2) << fixed
       << "Length: " << length << endl
       << "Width: " << width << endl
       << "Area: " << area << endl;
}