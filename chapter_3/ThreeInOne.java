
public class ThreeInOne {

  private int numberOfStacks = 3;
  private int capacity;
  private int[] values;
  private int[] sizes;

  public ThreeInOne( int size ) {
    this.capacity = size;
    values = new int[size * numberOfStacks];
    sizes = new int[numberOfStacks];
  }

  public int pop( int stack ) {
    if ( isEmpty( stack ) ) {
      throw new EmptyStackException();
    }

    int topIndex = indexOfTop( stack );
    int value = values[topIndex];
    values[topIndex] = 0;
    sizes[stack]--;
    return value;
  }

  public int push( int stack, int val ) throws FullStackException {
    if ( !isEmpty(stack) ) {
      throw new FullStackException();
    }

    sizes[stack]++;
    values[indexOfTop(stack)] = val;
  }

  public int peek( int stack ) {
    if ( isEmpty(stack) ) {
      throw new EmptyStackException();
    }

    return values[indexOfTop(stack)];
  }

  public boolean isEmpty( int stack ) {
    return sizes[stack] == 0;
  }

  private int indexOfTop( int stack ) {
    int offset = stack * capacity;
    int size = sizes[stack];
    return offset + size - 1;
  }

  public static void main( String[] args ) {
    ThreeInOne checker = new ThreeInOne(5);
    try {
      checker.push(1);
    } catch ( FullStackException e ) {
      System.out.println( "Full stack!" );
    }

    System.out.println(checker.peek(0));
    System.out.println(checker.isEmpty(0));
    System.out.println(checker.pop(0));

  }

}
