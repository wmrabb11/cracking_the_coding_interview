import java.util.*;

public class MergeSort {

  public static void mergesort( int[] array ) {
    mergesort( array, new int[array.length], 0, array.length - 1 );
  }

  public static void mergesort( int[] array, int[] temp, int leftStart, int rightEnd ) {
    if ( leftStart >= rightEnd ) {
      return;
    }
    int middle = ( leftStart + rightEnd ) / 2;
    mergesort( array, temp, leftStart, middle );
    mergesort( array, temp, middle + 1, rightEnd );
    merge( array, temp, leftStart, rightEnd );
  }

  public static void merge( int[] array, int[] temp, int leftStart, int rightEnd ) {
    int leftEnd = ( rightEnd + leftStart ) / 2;
    int rightStart = leftEnd + 1;
    int size = rightEnd - leftStart + 1;

    int left = leftStart;
    int right = rightStart;
    int index = leftStart;

    while ( left <= leftEnd && right <= rightEnd ) {
      if ( array[left] <= array[right] ) {
        temp[index] = array[left];
        left++;
      } else {
        temp[index] = array[right];
        right++;
      }
      index++;
    }

    System.arraycopy( array, left, temp, index, leftEnd - left + 1 );
    System.arraycopy( array, right, temp, index, rightEnd - right + 1 );
    System.arraycopy( temp, leftStart, array, leftStart, size );
  }

  public static void main( String[] args ) {
    int[] array = {10, 5, 4, 7, 2, 8};
    System.out.println( Arrays.toString( array ) );
    mergesort( array );
    System.out.println( Arrays.toString( array ) );
  }

}
