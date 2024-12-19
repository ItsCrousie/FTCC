#ifndef BOX_H
#define BOX_H

class Box {
  private:
    double width;
    double length;
    double height;

  public:
    void setWidth(double input_width) {
      width = input_width;
    };

    void setLength(double input_length) {
      length = input_length;
    };

    void setHeight(double input_height) {
      height = input_height;
    };

    double getWidth() {
      return width;
    }

    double getLength() {
      return length;
    }

    double getHeight() {
      return height;
    }

    //Easteregg, because turns out I didn't need this ＞﹏＜
    double getSurfaceArea() {
      return 2 * (width * height) + 2 * (length * height);
    }

    double getVolume() {
      return length * width * height;
    }
};
#endif