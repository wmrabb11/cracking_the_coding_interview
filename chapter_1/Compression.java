import java.util.*;

public class Compression {

  public String compress( String s ) {
    Character prev = null;
    StringBuilder toReturn = new StringBuilder( "" );
    for ( int i = 0; i < s.length(); i++ ) {
      Character curr = s.charAt( i );
      int count = 1;
      if ( curr == prev ) {
        while ( ( i + 1 ) < s.length() && curr == prev ) {
          prev = curr;
          i++;
          curr = s.charAt( i );
          count++;
        }
        if ( i == s.length() - 1 && curr == prev ) {
          count++;
        }
        toReturn.append( Character.toString(prev) + count );
      } else if ( prev != null ) {
        toReturn.append( Character.toString(prev) + count );
      }
      prev = curr;
    }
    return toReturn.toString();
  }

  public static void main( String[] args ) {
    Compression checker = new Compression();
    System.out.println( "Checking 'aabcccccaaa': " + checker.compress( "aabcccccaaa" ) );
  }

}
