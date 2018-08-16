public class OneAway {

  public boolean oneAway( String a, String b ) {
    String newStr = "";
    int counter = 0;

    if ( a.equals( b ) ) {
      return true;
    }

    if ( a.length() > b.length() ) {
      int bCount = 0;
      for ( int i = 0; i < a.length(); i++ ) {
        char aChar = a.charAt(i);
        char bChar = '.';
        try {
          bChar = b.charAt(bCount);
        }
        catch(StringIndexOutOfBoundsException e) {
          bChar = '\t';
        }
        if ( aChar == bChar ) {
          newStr += aChar;
          bCount++;
        } else {
          counter++;
        }
      }
      if ( newStr.equals( b ) && counter <= 1 ) {
        return true;
      }
    } else if ( a.length() < b.length() ) {
      int aCount = 0;
      for ( int i = 0; i < b.length(); i++ ) {
        char aChar = a.charAt(aCount);
        char bChar = b.charAt(i);
        if ( aChar == bChar ) {
          newStr += aChar;
          aCount++;
        } else {
          counter++;
        }
      }
      if ( newStr.equals( a ) && counter <= 1 ) {
        return true;
      }
    } else {
      StringBuilder realA = new StringBuilder(a);
      StringBuilder realB = new StringBuilder(b);
      for ( int i = 0; i < a.length(); i++ ) {
        char aChar = a.charAt(i);
        char bChar = b.charAt(i);
        if ( aChar != bChar ) {
          realA.setCharAt(i, bChar);
          counter++;
        }
      }
      if ( realA.toString().equals( realB.toString() ) && counter <= 1 ) {
        return true;
      }
    }
    return false;
  }

  public static void main( String[] args ) {
    OneAway checker = new OneAway();
    String a1 = "pale";
    String b1 = "ple";
    String a2 = "pales";
    String b2 = "pale";
    String a3 = "pale";
    String b3 = "bale";
    String a4 = "pale";
    String b4 = "bake";
    System.out.println(a1 + ", " + b1 + "; Expected: true; Actual: " + checker.oneAway(a1, b1));
    System.out.println(a2 + ", " + b2 + "; Expected: true; Actual: " + checker.oneAway(a2, b2));
    System.out.println(a3 + ", " + b3 + "; Expected: true; Actual: " + checker.oneAway(a3, b3));
    System.out.println(a4 + ", " + b4 + "; Expected: false; Actual: " + checker.oneAway(a4, b4));
  }

}
