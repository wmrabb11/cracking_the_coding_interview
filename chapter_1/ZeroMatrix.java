import java.util.*;

public class ZeroMatrix {

  public void setZeros( int[][] matrix ) {
    boolean[] row = new boolean[matrix.length];
    boolean[] col = new boolean[matrix[0].length];

    for ( int i = 0; i < matrix.length; i++ ) {
      for ( int j = 0; j < matrix[0].length; j++ ) {
        if ( matrix[i][j] == 0 ) {
          row[i] = true;
          col[i] = true;
        }
      }
    }

    for ( int i = 0; i < row.length; i++ ) {
      if ( row[i] )
        nullRow( matrix, i );
    }

    for ( int i = 0; i < col.length; i++ ) {
      if ( col[i] )
        nullCol( matrix, i );
    }
  }

  private void nullRow( int[][] matrix, int row ) {
    for ( int i = 0; i < matrix[0].length; i++ ) {
      matrix[row][i] = 0;
    }
  }

  private void nullCol( int[][] matrix, int col ) {
    for ( int i = 0; i < matrix.length; i++ ) {
      matrix[i][col] = 0;
    }
  }

  private void printMatrix( int[][] matrix ) {
    for ( int i = 0; i < matrix.length; i++ ) {
      for ( int j = 0; j < matrix[0].length; j++ ) {
        System.out.print(matrix[i][j] + ", ");
      }
      System.out.println();
    }
  }

  public static void main( String[] args ) {
    ZeroMatrix checker = new ZeroMatrix();
    int[][] matrix = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0} };
    checker.printMatrix( matrix );
    checker.setZeros( matrix );
    checker.printMatrix( matrix );
  }

}
