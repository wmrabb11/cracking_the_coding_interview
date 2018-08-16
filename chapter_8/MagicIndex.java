import java.util.*;

public class MagicIndex {

  public int bruteFindMagicIndex( int[] array ) {
    for ( int i = 0; i < array.length; i++ ) {
      if ( i == array[i] ) {
        return i;
      }
    }
    return -1;
  }

  public int magicFast( int[] array ) {
    return magicFast( array, 0, array.length - 1 );
  }

  private int magicFast( int[] array, int start, int end ) {
    if ( end < start ) {
      return -1;
    }

    int midIndex = ( start + end ) / 2;
    int midValue = array[midIndex];
    if ( midValue == midIndex ) {
      return midIndex;
    }

    int leftIndex = Math.min( midIndex - 1, midValue );
    int left = magicFast( array, start, leftIndex );
    if ( left >= 0 ) {
      return left;
    }

    int rightIndex = Math.min( midIndex + 1, midValue );
    int right = magicFast( array, rightIndex, end );
    return right;
  }

  public static void main( String[] args ) {
    MagicIndex checker = new MagicIndex();
    int[] array = {-10, 5, 2, 2, 2, 3, 4, 7, 9, 12, 13};
    //System.out.println( checker.bruteFindMagicIndex( array ) );
    System.out.println( checker.magicFast( array ) );
  }

}
