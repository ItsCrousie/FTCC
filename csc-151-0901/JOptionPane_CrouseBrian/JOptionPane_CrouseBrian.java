import javax.swing.JOptionPane;

public class RectangleTest {
  public static void main(String[] args) {
    String input;
    int length;
    int width;
    int area;

    input = JOptionPane.showInputDialog("Enter Length");

    length = Integer.parseInt(input);

    input = JOptionPane.showInputDialog("Enter Width");

    width = Integer.parseInt(input);

    area = length * width;

    JOptionPane.showMessageDialog(null, "Area of rectangle is "+ area);
  }
}

