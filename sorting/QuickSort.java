import java.util.*;

public class QuickSort {

  public static void quicksort( int[] array ) {
    quicksort( array, 0, array.length - 1 );
  }

  public static void quicksort( int[] array, int left, int right ) {
    if ( left >= right ) {
      return;
    }

    int pivot = array[(left + right) / 2];
    int index = partition( array, left, right, pivot );
    quicksort( array, left, index - 1 );
    quicksort( array, index, right );
  }

  public static int partition( int[] array, int left, int right, int pivot ) {
    while ( left <= right ) {
      while ( array[left] < pivot ) {
        left++;
      }

      while ( array[right] > pivot ) {
        right--;
      }

      if ( left <= right ) {
        int tmpLeft = array[left];
        int tmpRight = array[right];
        array[left] = tmpRight;
        array[right] = tmpLeft;
        left++;
        right--;
      }
    }
    return left;
  }

  public static void main( String[] args ) {
    int[] array = {5, 4, 1, 7, 10, 8};
    System.out.println( Arrays.toString(array) );
    quicksort( array );
    System.out.println( Arrays.toString(array) );
  }

}
