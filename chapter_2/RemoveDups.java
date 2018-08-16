import java.util.*;

public class RemoveDups {

  public void removeDups( LinkedListNode root ) {
    HashSet<Integer> set = new HashSet<Integer>();
    LinkedListNode prev = null;
    while ( root != null ) {
      if ( set.contains(root.data) ) {
        prev.next = root.next;
      } else {
        set.add(root.data);
        prev = root;
      }
      root = root.next;
    }
  }

  public static void main( String[] args ) {
    RemoveDups checker = new RemoveDups();
  }

}
