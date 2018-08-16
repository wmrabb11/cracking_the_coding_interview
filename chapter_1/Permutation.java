import java.util.*;

public class Permutation {

  public boolean isPermutation( String a, String b ) {
    char[] aArray = a.toCharArray();
    char[] bArray = b.toCharArray();

    Arrays.sort(aArray);
    Arrays.sort(bArray);

    if ( Arrays.equals(aArray, bArray) ) {
      return true;
    } else {
      return false;
    }
  }

  public static void main( String[] args ) {
    Permutation checker = new Permutation();
    String a1 = "abcdef";
    String b1 = "fedcba";
    System.out.println( a1 + ", " + b1 + ": " + checker.isPermutation(a1, b1) );
    String a2 = "abc";
    String b2 = "def";
    System.out.println( a2 + ", " + b2 + ": " + checker.isPermutation(a2, b2) );
  }

}
