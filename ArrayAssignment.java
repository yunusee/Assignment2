public class ArrayAssignment {
    public static int minimumOfArray( int[] arr )
  {
    int minimum = arr[0];

    for ( int i = 0; i < arr.length; i++ )
    {
      if ( arr[i] < minimum )
        minimum = arr[i];
    }
    return minimum;
  }

  public static int maximumOfArray( int[] arr )
  {
    int maximum = arr[0];

    for ( int i = 0; i < arr.length; i++ )
    {
      if ( arr[i] > maximum )
        maximum = arr[i];
    }
    return maximum;
  }
}
