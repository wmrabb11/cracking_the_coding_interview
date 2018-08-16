import java.util.*;

public class KthToLast {

  public LinkedListNode getKthToLast( LinkedListNode root, int k ) {
    int size = 0;
    LinkedListNode ptr = root;
    while ( ptr != null ) {
      ptr = ptr.next;
      size++;
    }

    int toFind = size - k;
    LinkedListNode toReturn = root;
    for ( int i = 0; i < toFind; i++ ) {
      toReturn = toReturn.next;
    }

    return toReturn;
  }

  public static void main( String[] args ) {

  }

}
