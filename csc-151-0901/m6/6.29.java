import java.util.Scanner;

public class LabProgram {

  public static int[] swapValues(int[] preSwap) {
    int temp;
    for (int i = 0; i < preSwap.length; i += 2) {
      temp = preSwap[i+1];
      preSwap[i+1] = preSwap[i];
      preSwap[i] = temp;
    }
    return preSwap;
  }

  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int[] toSwap = new int[4];
    //read in
    for (int i = 0; i < toSwap.length; i += 1) {
      toSwap[i] = scnr.nextInt();
    }
    //swap
    swapValues(toSwap);
    //display
    for (int j = 0; j < toSwap.length; j += 1) {
      if (j == toSwap.length -1) {
         System.out.printf("%d", toSwap[j]);
         continue;
      }
      System.out.printf("%d ", toSwap[j]);
    }
    System.out.print("\n");
  }
}

