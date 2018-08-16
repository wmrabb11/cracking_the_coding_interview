import java.util.*;

public class Palindrome {

  public boolean isPermutationPalindrome( String s ) {
    int[] table = buildCharFrequencyTable( s );
    return checkMaxOneOdd( table );
  }

  private boolean checkMaxOneOdd( int[] table ) {
    boolean foundOdd = false;
    for ( int count : table ) {
      if ( count % 2 == 1 ) {
        if ( foundOdd ) {
          return false;
        }
        foundOdd = true;
      }
    }
    return true;
  }

  private int getCharNumber( Character c ) {
    int a = Character.getNumericValue( 'a' );
    int z = Character.getNumericValue( 'z' );
    int val = Character.getNumericValue( c );
    if ( a <= val && val <= z ) {
      return val - a;
    }
    return -1;
  }

  private int[] buildCharFrequencyTable( String s ) {
    int[] table = new int[Character.getNumericValue( 'z' ) - Character.getNumericValue( 'a' ) + 1];
    for ( char c : s.toCharArray() ) {
      int x = getCharNumber( c );
      if ( x != -1 ) {
        table[x]++;
      }
    }
    return table;
  }

  public static void main( String[] args ) {
    Palindrome checker = new Palindrome();
    System.out.println( "checking 'tact coa': " + checker.isPermutationPalindrome( "tact coa" ) );
  }

}
