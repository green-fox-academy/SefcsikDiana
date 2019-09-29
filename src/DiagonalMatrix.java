import java.lang.reflect.Array;

public class Matrix {
  // - Create (dynamically) a two dimensional array
  //   with the following matrix. Use a loop!
  //
  //   1 0 0 0
  //   0 1 0 0
  //   0 0 1 0
  //   0 0 0 1
  //
  // - Print this two dimensional array to the output
// 1. megoldas:
  public static void main(String[] args) {
    int[][] matrix = new int[4][4];
     //row,column
    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix.length; column++) {
        if (row == column) {
          matrix[row][column] = 1;
        }
        System.out.print(matrix[row][column] + " ");
      }
      System.out.println();
    }
  }
}


// 2. megoldas:
//  public static void main(String[] args) {
//    int[][] matrix = new int[4][4];
//    for (int row = 0; row < matrix.length; row++) {
//      for (int column = 0; column < matrix.length; column++) {
//        if (row == column) {
//          matrix[row][column] = 1;
//        } else {
//          matrix[row][column] = 0;
//        }
//        System.out.print(matrix[row][column] + " ");
//      }
//      System.out.println();
//    }
//  }
//}
