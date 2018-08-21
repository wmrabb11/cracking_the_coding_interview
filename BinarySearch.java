public class BinarySearch {

  public int binarySearch( int[] array, int toFind ) {
    return binarySearch( array, 0, array.length - 1, toFind );
  }

  public int binarySearch( int[] array, int low, int high, int toFind ) {
    if ( high >= low ) {
      int mid = ( low + ( high - 1 ) ) / 2;
      if ( array[mid] == toFind )
        return mid;

      if ( array[mid] > toFind )
        return binarySearch( array, low, mid - 1, toFind );

      return binarySearch( array, mid + 1, high, toFind );
    }
    return -1;
  }

  public static void main( String[] args ) {
    BinarySearch checker = new BinarySearch();
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int result = checker.binarySearch( arr, 8 );
    if ( result == -1 )
        System.out.println( "Element not found" );
    else
        System.out.println( "Element found at index " + result );
  }
}
