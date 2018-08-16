import java.util.*;

public class RobotGrid {

  public ArrayList<Point> getPath( boolean[][] maze ) {
    if ( maze == null || maze.length == 0 ) {
      return null;
    }

    ArrayList<Point> path = new ArrayList<Point>();
    HashSet<Point> failedPoints = new HashSet<Point>();
    if ( getPath(maze, maze.length - 1, maze[0].length - 1, path, failedPoints ) ) {
      return path;
    }
    return null;
  }

  public boolean getPath( boolean[][] maze, int row, int col, ArrayList<Point> path, HashSet<Point> failedPoints ) {
    if ( col < 0 || row < 0 || !maze[row][col] ) {
      return false;
    }

    Point p = new Point( row, col );

    if ( failedPoints.contains( p ) ) {
      return false;
    }

    boolean isAtOrigin = ( row == 0 ) && ( col == 0 );

    if ( isAtOrigin || getPath( maze, row, col - 1, path, failedPoints ) || getPath( maze, row - 1, col, path, failedPoints ) ) {
      path.add( p );
      return true;
    }

    failedPoints.add( p );
    return false;
  }

  class Point {
    private int row;
    private int col;

    public Point( int row, int col ) {
      this.row = row;
      this.col = col;
    }

    public String toString() {
      StringBuilder s = new StringBuilder( "" );
      s.append( "(" );
      s.append( this.row );
      s.append( ", " );
      s.append( this.col );
      s.append( ")" );
      return s.toString();
    }
  }


  public static void main( String[] args ) {
    RobotGrid checker = new RobotGrid();
    boolean[][] maze = { {true, true, true, true},
                         {false, true, true, false},
                         {false, false, true, true},
                         {true, false, false, true} };
    System.out.println( checker.getPath( maze ) );

  }
}
