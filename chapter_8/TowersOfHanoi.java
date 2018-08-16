import java.util.*;

public class TowersOfHanoi {

  class Tower {
    private Stack<Integer> disks;
    private int index;

    public Tower( int i ) {
      disks = new Stack<Integer>();
      index = i;
    }

    public int index() {
      return this.index;
    }

    public void add( int d ) {
      if ( !disks.isEmpty() && disks.peek() <= d ) {
        System.out.println( "Error placing disk " + d );
      } else {
        disks.push( d );
      }
    }

    public void moveTopTo( Tower t ) {
      int top = disks.pop();
      t.add( top );
    }

    public void moveDisks( int n, Tower dest, Tower buffer ) {
      if ( n > 0 ) {
        moveDisks( n - 1, buffer, dest );
        moveTopTo( dest );
        buffer.moveDisks( n - 1, dest, this );
      }
    }
  }

  public void main( String[] args ) {
    int n = 3;
    Tower[] towers = new Tower[n];
    for ( int i = 0; i < n; i++ ) {
      towers[i] = new Tower(i);
    }

    for ( int i = n - 1; i >= 0; i-- ) {
      towers[0].add( i );
    }
    towers[0].moveDisks(n, towers[2], towers[1] );
  }

}
