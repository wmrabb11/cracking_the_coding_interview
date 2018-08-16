import java.util.*;

public class PowerSet {

  public ArrayList<Integer> getSubsets( ArrayList<Integer> set, int index ) {
    ArrayList<ArrayList<Integer>> allSubsets;
    if ( set.size() == index ) {
      allSubsets = new ArrayList<ArrayList<Integer>>();
      allSubsets.add( new ArrayList<Integer>() );
    } else {
      allSubsets = getSubsets( set, index + 1 );
      int item = set.get( index );
      ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();
      for ( ArrayList<Integer> subset : allSubsets ) {
        ArrayList<Integer> newSubset = new ArrayList<Integer>();
        newSubset.addAll( subset );
        newSubset.add( item );
        moresubsets.add( newSubset );
      }
      allSubsets.addAll( moresubsets );
    }
    return allSubsets;
  }

  public static void main( String[] args ) {
    PowerSet checker = new PowerSet();
    
  }

}
