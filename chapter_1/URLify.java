import java.util.*;

public class URLify {

  public void urlify( char[] s, int len ) {
    int spaces = 0, newLen;

    for ( int i = 0; i < len; i++ ) {
      if ( s[i] == ' ' ) {
        spaces++;
      }
    }

    newLen = len + spaces * 2;
    s[newLen] = '\0';

    for ( int i = len - 1; i >= 0; i-- ) {
      if ( s[i] == ' ' ) {
        s[newLen - 1] = '0';
        s[newLen - 2] = '2';
        s[newLen - 3] = '%';
        newLen = newLen - 3;
      } else {
        s[newLen - 1] = s[i];
        newLen = newLen - 1;
      }
    }

  }

  public static void main( String[] args ) {
    URLify checker = new URLify();
    char[] a = "Mr John Smith     ".toCharArray();
    checker.urlify(a, 13);
    System.out.println( a );
  }

}
