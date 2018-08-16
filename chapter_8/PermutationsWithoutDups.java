import java.util.*;

public class PermutationsWithoutDups {

  public ArrayList<String> compute( String s ) {
    if ( s == null ) return null;

    ArrayList<String> perms = new ArrayList<String>();
    
    if ( s.length() == 0 ) {
      perms.add( "" );
      return perms;
    }

    char first = s.charAt( 0 );
    String remainder = s.substring( 1 );
    ArrayList<String> words = compute( remainder );
    for ( String word : words ) {
      for ( int i = 0; i <= word.length(); i++ ) {
        String toInsert = insertCharAt( word, first, i );
        perms.add( toInsert );
      }
    }

    return perms;
  }

  private String insertCharAt( String word, char c, int i ) {
    String start = word.substring( 0, i );
    String end = word.substring( i );
    return start + c + end;
  }

  public static void main( String[] args ) {
    PermutationsWithoutDups checker = new PermutationsWithoutDups();
    ArrayList<String> result = checker.compute( "will" );
    for ( String word : result ) {
      System.out.println( word );
    }
  }

}
