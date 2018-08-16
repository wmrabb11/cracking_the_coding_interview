import java.util.*;

public class StringRotation {

  public boolean myIsRotation( String a, String b ) {
    char[] aArray = a.toCharArray();
    char[] bArray = b.toCharArray();
    Arrays.sort( aArray );
    Arrays.sort( bArray );

    if ( Arrays.equals( aArray, bArray ) ) {
      return true;
    }
    return false;
  }

  public boolean theirIsRotation( String a, String b ) {
    int len = a.length();

    if ( len == b.length() && len > 0 ) {
      String aa = a + a;
      return isSubstring(aa, b);
    }

    return false;
  }

  public static void main( String[] args ) {
    StringRotation checker = new StringRotation();
    String a = "waterbottle";
    String b = "erbottlewat";
    System.out.println( a + ", " + b + ": " + checker.myIsRotation( a, b ) );
  }

}
