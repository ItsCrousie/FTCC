/*
CSC-134-1901
M6T1
Brian Crouse
09Dec2024
*/

#include <iostream>

using namespace std;

class Restaurant {
  public:
    void SetName(string restaurant_name) {
      name = restaurant_name;
    }

    void SetRating(int userRating) {
      rating = userRating;
    }

    void Print() {
      cout << name << " ---- " << rating << "stars" << endl;
    }

  private:
    string name;
    int rating;
};

int main() {
  Restaurant favorite_mexican_place;
  favorite_mexican_place.SetName("La Catrina");
  favorite_mexican_place.SetRating(5);
  favorite_mexican_place.Print();

  Restaurant favorite_Korean_Place;
  favorite_Korean_Place.SetName("Mr. K's");
  favorite_Korean_Place.SetRating(4);
  favorite_Korean_Place.Print();

  Restaurant favorite_Thai_Place;
  favorite_Thai_Place.SetName("Chopstix");
  favorite_Thai_Place.SetRating(5);
  favorite_Thai_Place.Print();

  return 0;
}