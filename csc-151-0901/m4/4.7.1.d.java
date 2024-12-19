import java.util.Scanner;

public class NestedLoops {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numRows;
      int numColumns;
      int currentRow;
      int currentRowInteger;
      int currentColumn;
      char currentColumnLetter;
      int columnLetterAsciiValue = 64;

      numRows = scnr.nextInt();
      numColumns = scnr.nextInt();
      currentRow = 1;
      currentColumn = 1;

      for (currentRow = 1; currentRow <= numRows; currentRow += 1) {
        for (currentColumn = 1; currentColumn <= numColumns; currentColumn += 1) {
            currentColumnLetter = (char) ('A' + currentColumn - 1);
            System.out.printf("%d%c ", currentRow, currentColumnLetter);
        }
        System.out.println();
      }
   }
}