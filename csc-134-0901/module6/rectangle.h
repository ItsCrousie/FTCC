#ifndef RECTANGLE_H
#define RECTANGLE_H

class Rectangle {
  private:
    double width;
    double length;

  public:
    void setWidth(double input_width) {
      width = input_width;
    };

    void setLength(double input_length) {
      length = input_length;
    };

    double getWidth() {
      return width;
    }

    double getLength() {
      return length;
    }

    double getArea() {
      return width * length;
    }
};
#endif