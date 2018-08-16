import java.util.*;

public class RecursiveMultiply {

  public int multiply( int a, int b ) {
    int big = a < b ? b : a;
    int small = a < b ? a : b;
    return helper( small, big );
  }

  private int helper( int smaller, int bigger ) {
    if ( smaller == 0 ) return 0;
    else if ( smaller == 1 ) return bigger;

    int s = smaller >> 1; //Divide by two with bit shifitng
    int half = helper( s, bigger );

    if ( smaller % 2 == 0 ) {
      return half + half;
    } else {
      return half + half + bigger;
    }
  }

  public static void main( String[] args ) {
    RecursiveMultiply checker = new RecursiveMultiply();
    System.out.println( checker.multiply( 3, 8 ) );
  }

}
