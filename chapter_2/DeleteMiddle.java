
public class DeleteMiddle {

  public boolean deleteMiddle( LinkedListNode n ) {
    if ( n == null || n.next == null ) {
      return false;
    }

    LinkedListNode next = n.next;
    n.data = next.data;
    n.next = next.next;
    return true;
  }

}
