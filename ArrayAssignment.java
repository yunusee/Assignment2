import java.util.Arrays;
import java.util.Random;

public class ArrayAssignment {
<<<<<<< HEAD
    public static int[] createArray(int num){
        int[] array = new int[num];
        Random random = new Random();
    
        for(int i = 0; i < array.length; i++){
          array[i] = random.nextInt(101);
        } 
        return array;
      }
=======
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
>>>>>>> main
}
