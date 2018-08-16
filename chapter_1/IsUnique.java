import java.util.*;

public class IsUnique {

  public boolean isUnique( String s ) {
    for ( int i = 0; i < s.length(); i++ ) {
      for ( int j = 0; j < s.length(); j++ ) {
        if ( i == j ) {
          continue;
        }
        if ( s.charAt(i) == s.charAt(j) ) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main( String[] args ) {
    IsUnique checker = new IsUnique();
    String a = "abcdefg";
    String b = "aabcdefg";
    String c = "abcdaefg";
    String d = "abcddefg";
    String e = "abcdefgg";
    System.out.println(a + ": " + checker.isUnique(a));
    System.out.println(b + ": " + checker.isUnique(b));
    System.out.println(c + ": " + checker.isUnique(c));
    System.out.println(d + ": " + checker.isUnique(d));
    System.out.println(e + ": " + checker.isUnique(e));
  }

}
