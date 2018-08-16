import java.util.*;

public class TripleStep {

  public int bruteCount( int n ) {
    if ( n < 0 ) {
      return 0;
    } else if ( n == 0 ) {
      return 1;
    } else {
      return bruteCount(n - 1) + bruteCount(n - 2) + bruteCount(n - 3);
    }
  }

  public int memoCount( int n ) {
    int[] memo = new int[n + 1];
    Arrays.fill( memo, -1 );
    return memoCount( n, memo );
  }

  public int memoCount( int n, int[] memo ) {
    if ( n < 0 ) {
      return 0;
    } else if ( n == 0 ) {
      return 1;
    } else if ( memo[n] > - 1 ) {
      return memo[n];
    } else {
      memo[n] = memoCount( n - 1, memo ) + memoCount( n - 2, memo ) + memoCount( n - 3, memo );
      return memo[n];
    }
  }

  public static void main( String[] args ) {
    TripleStep checker = new TripleStep();
    System.out.println( checker.bruteCount( 5 ) );
    System.out.println( checker.memoCount( 5 ) );
  }

}
